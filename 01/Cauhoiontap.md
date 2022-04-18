###### 1.Trong quá trình tạo dự án Spring Boot chúng ta phải khai báo những tham số sau đây : groupID, artifactID. Ý nghĩa các tham số này là gì?
- Group Id : Tên tổ chức / công ty / cá nhân của dự án.
- Artifact Id : Tên của packge, dự án.

###### 2.Tại sao phải đảo ngược tên miền trong <groupId>vn.techmaster</groupId>
- Đảo ngược tên miền nó sẽ giúp đảm bảo sẽ không có bất kỳ xung đột Module nào.

###### 3.SpringBoot có 2 cơ chế để quản lý thư viện. Hãy kể tên chúng?
- Maven & Gradle

###### 4.File pom.xml có tác dụng gì?
- File pom.xml là nơi khai báo tất cả những gì liên quan đến dự án được cấu hình qua maven, như khai báo các dependency,
  version của dự án, tên dự án, repossitory

######5.Trong file pom.xml có các thẻ dependency. Ý nghĩa của chúng là gì?
-Khai báo thư viện spring-boot-starter-web

######6.Ý nghĩa của @Controllerlà gì?
- Đối tượng của lớp này được dùng để xử lý các request đến một trang nào đó được định nghĩa trong lớp này

######7.Ý nghĩa của @RequestMapping là gì? Nó có những tham số gì ngoài value?
- Annotation @RequestMapping được sử dụng để map request với class hoặc method xử lý request đó.
- Value, method, params
######8.Ý nghĩa của @RequestBody khi đặt trong hàm hứng request để làm gì?
- Một tham số phương thức được liên kết với phần thân của yêu cầu web.

######9.Hãy trả lời khi nào thì dùng @PathVariable và khi nào nên dùng @RequestParam
- @PathVariable thì được dùng để trích xuất dữ liệu từ URL path.
- @RequestParam được dùng để trích xuất dữ liệu từ request query.

######11.@GetMapping khác gì so với @PostMapping?
- @GetMapping cho method GET, trả về một Resource hoặc một danh sách Resource.
- @PostMapping cho method POST, tạo mới một Resource.

######12.Trong các annotation @RequestMapping, @GetMapping, @PostMapping… có tham số produces = MediaType.XXXX ý nghĩa tham số này là gì?
- Trả về kiểu dữ liệu mà mình muốn như (Json, Xml,,,).
######13.Giải thích ý nghĩa của @RequestBody trong đoạn code dưới đây
- nó chuyển chuỗi JSON trong request thành một Object Java.