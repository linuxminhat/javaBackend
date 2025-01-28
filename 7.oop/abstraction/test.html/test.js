document.addEventListener("DOMContentLoaded", function () {
  // ... (các đoạn mã khác)

  const updatePrivacyButton = document.getElementById("updatePrivacyButton");
  const updatePrivacyButtonText = document.getElementById(
    "updatePrivacyButtonText"
  );
  const updatePrivacyButtonSpinner = document.getElementById(
    "updatePrivacyButtonSpinner"
  );
  const successPrivacyModal = new bootstrap.Modal(
    document.getElementById("successPrivacyModal")
  );

  updatePrivacyButton.addEventListener("click", function () {
    // Thu thập dữ liệu từ các trường nhập liệu
    const privateSubscriptions = document.getElementById(
      "privateSubscriptions"
    ).checked;

    // Tạo một FormData để gửi dữ liệu
    const formData = new FormData();
    formData.append("private_subscriptions", privateSubscriptions.toString());

    // Hiển thị Spinner và vô hiệu hóa nút
    updatePrivacyButtonSpinner.classList.remove("d-none");
    updatePrivacyButton.disabled = true;
    // Đổi văn bản nút
    updatePrivacyButtonText.textContent = "Đang lưu...";

    // Gửi dữ liệu đến backend bằng Fetch API
    fetch("/api/user/privacy/update", {
      method: "PUT",
      headers: {
        "X-CSRFToken": csrfToken, // Sử dụng CSRF token từ trước
      },
      body: formData,
    })
      .then((response) => response.json())
      .then((data) => {
        setTimeout(function () {
          // Ẩn Spinner và bật lại nút
          updatePrivacyButtonSpinner.classList.add("d-none");
          updatePrivacyButton.disabled = false;
          // Đổi văn bản nút trở lại
          updatePrivacyButtonText.textContent = "Lưu thay đổi";

          if (data.message === "Privacy settings updated successfully") {
            // Hiển thị Modal thông báo thành công
            successPrivacyModal.show();
          } else {
            // Hiển thị thông báo lỗi
            alert(
              data.message ||
                "Có lỗi xảy ra khi cập nhật cài đặt quyền riêng tư."
            );
          }
        }, 2500);
      })
      .catch((error) => {
        console.error("Error:", error);
        // Ẩn Spinner và bật lại nút
        updatePrivacyButtonSpinner.classList.add("d-none");
        updatePrivacyButton.disabled = false;
        // Đổi văn bản nút trở lại
        updatePrivacyButtonText.textContent = "Lưu thay đổi";

        // Hiển thị thông báo lỗi
        alert("Có lỗi xảy ra khi cập nhật cài đặt quyền riêng tư.");
      });
  });
});
