<!-- README for baongocmobile (HTML) -->
<div align="center" style="margin-bottom:24px;">
  <h1 style="margin:0 0 8px;">📱 Baongoc Mobile</h1>
  <p style="font-size:16px; margin:0 0 12px;">
    Hệ thống quản lý & bán hàng điện thoại di động – Spring Boot + Thymeleaf + MySQL
  </p>

  <!-- Badges -->
  <p>
    <a href="https://github.com/TruongNguyen111222/baongocmobile">
      <img alt="Repo" src="https://img.shields.io/badge/GitHub-baongocmobile-24292e?logo=github&labelColor=181717&color=24292e">
    </a>
    <img alt="Java" src="https://img.shields.io/badge/Java-11%2B-red">
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring%20Boot-2.7%2B-6db33f">
    <img alt="License" src="https://img.shields.io/badge/License-MIT-informational">
    <img alt="Build" src="https://img.shields.io/badge/Build-Maven-1565c0">
  </p>
</div>

<!-- TÓM TẮT -->
<section style="margin: 16px 0;">
  <h2>✨ Tổng quan</h2>
  <p>
    <b>Baongoc Mobile</b> là ứng dụng web quản lý cửa hàng điện thoại, hỗ trợ:
    quản lý sản phẩm, danh mục, đơn hàng, khách hàng, giỏ hàng, thanh toán, và
    dashboard thống kê. Ứng dụng tách rõ <i>Controller–Service–Repository</i>,
    giao diện server-side bằng <b>Thymeleaf</b>.
  </p>
</section>

<!-- TÍNH NĂNG -->
<section style="margin: 16px 0;">
  <h2>🧩 Tính năng chính</h2>
  <ul>
    <li>🛒 <b>Bán hàng</b>: duyệt sản phẩm, giỏ hàng, đặt hàng, thông báo khuyến mãi.</li>
    <li>📦 <b>Quản trị</b>: CRUD sản phẩm, danh mục, thương hiệu, voucher, blog/tin tức.</li>
    <li>👤 <b>Tài khoản</b>: đăng ký/đăng nhập, phân quyền (User/Admin/Nhân viên).</li>
    <li>📈 <b>Thống kê</b>: doanh thu theo ngày/tháng, top bán chạy.</li>
    <li>🧰 <b>Tiện ích</b>: validate dữ liệu, thông báo kết quả thao tác.</li>
  </ul>
</section>

<!-- CÔNG NGHỆ -->
<section style="margin: 16px 0;">
  <h2>🛠️ Công nghệ sử dụng</h2>
  <table>
    <tr>
      <td><b>Backend</b></td>
      <td>Java 11+, Spring Boot, Spring MVC, Spring Security (JWT nếu dùng), JPA/Hibernate</td>
    </tr>
    <tr>
      <td><b>Frontend</b></td>
      <td>Thymeleaf, HTML5, CSS3, JavaScript (jQuery/Fetch)</td>
    </tr>
    <tr>
      <td><b>Database</b></td>
      <td>MySQL (hoặc SQL Server tuỳ cấu hình)</td>
    </tr>
    <tr>
      <td><b>Build/Run</b></td>
      <td>Maven, Spring Boot Plugin</td>
    </tr>
  </table>
</section>

<!-- BẮT ĐẦU -->
<section style="margin: 16px 0;">
  <h2>🚀 Bắt đầu</h2>
  <details open>
    <summary><b>1) Yêu cầu môi trường</b></summary>
    <ul>
      <li>Java JDK 11+ (<code>java -version</code>)</li>
      <li>Maven 3.8+ (<code>mvn -v</code>)</li>
      <li>MySQL 8+ (tạo sẵn database, ví dụ: <code>baongocmobile</code>)</li>
    </ul>
  </details>

  <details open>
    <summary><b>2) Clone & cấu hình</b></summary>
    <pre><code>git clone https://github.com/TruongNguyen111222/baongocmobile.git
cd baongocmobile
</code></pre>
    <p>Chỉnh <code>src/main/resources/application.properties</code> (ví dụ):</p>
    <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/baongocmobile?useSSL=false&amp;serverTimezone=Asia/Ho_Chi_Minh
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.thymeleaf.cache=false
</code></pre>
  </details>

  <details open>
    <summary><b>3) Chạy ứng dụng</b></summary>
    <pre><code>mvn spring-boot:run
# Mặc định: http://localhost:8080
</code></pre>
  </details>
</section>

<!-- CẤU TRÚC THƯ MỤC -->
<section style="margin: 16px 0;">
  <h2>📁 Cấu trúc thư mục (rút gọn)</h2>
  <pre><code>baongocmobile/
├─ src/
│  ├─ main/
│  │  ├─ java/com/web/...
│  │  │  ├─ controller/       # Web Controllers (Spring MVC)
│  │  │  ├─ service/          # Business logic
│  │  │  ├─ repository/       # JPA repositories
│  │  │  ├─ model/entity/     # JPA entities
│  │  │  └─ config/           # Security, CORS, etc.
│  │  └─ resources/
│  │     ├─ templates/        # Thymeleaf templates
│  │     │  ├─ user/index.html
│  │     │  └─ admin/...
│  │     ├─ static/           # css, js, images
│  │     └─ application.properties
│  └─ test/                   # Unit/Integration tests
└─ pom.xml
</code></pre>
</section>

<!-- ẢNH CHỤP -->
<section style="margin: 16px 0;">
 
  <p>
    Trang chủ
  </p>
</section>

<!-- GÓP Ý -->
<section style="margin: 16px 0;">
  <h2>🤝 Đóng góp</h2>
  <ol>
    <li>Fork repo & tạo nhánh: <code>git checkout -b feature/ten-chuc-nang</code></li>
    <li>Commit: <code>git commit -m "feat: mo ta ngan"</code></li>
    <li>Push: <code>git push origin feature/ten-chuc-nang</code></li>
    <li>Mở Pull Request</li>
  </ol>
</section>

<!-- LIÊN HỆ -->
<section style="margin: 16px 0;">
  <h2>📬 Liên hệ</h2>
  <ul>
    <li>Tác giả: <b>Trưởng Nguyễn</b></li>
    <li>GitHub: <a href="https://github.com/TruongNguyen111222">TruongNguyen111222</a></li>
  </ul>
</section>

<!-- LICENSE -->
<section style="margin: 16px 0;">
  <h2>📄 Giấy phép</h2>
  <p>Mã nguồn được phát hành theo giấy phép <a href="LICENSE">MIT</a>.</p>
</section>
