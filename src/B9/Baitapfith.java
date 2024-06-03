package B9;



public class Baitapfith {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[10];
        arr[0] = new Student(1,"Phan Đình Tạc",23,"01234567789","asd@gmail.com");
        arr[1] = new Student(2,"Phan Đình Tạc",23,"01234567789","asd@gmail.com");
        arr[2] = new Student(3,"Phan Đình Tạc",26,"01234567789","asd@gmail.com");
        arr[3] = new Student(4,"Phan Đình Tạc",14,"01234567789","asd@gmail.com");
        arr[4] = new Student(5,"Phan Đình Tạc",22,"01234567789","asd@gmail.com");
        arr[5] = new Student(6,"Phan Đình Tạc",51,"01234567789","asd@gmail.com");
        arr[6] = new Student(7,"Phan Đình Tạc",12,"01234567789","asd@gmail.com");
        arr[7] = new Student(8,"Phan Đình Tạc",52,"01234567789","asd@gmail.com");
        arr[8] = new Student(9,"Phan Đình Tạc",12,"01234567789","asd@gmail.com");
        arr[9] = new Student(10,"Phan Đình Tạc",23,"01234567789","asd@gmail.com");


            System.out.print("\n\t\t\t\t\t\t\t\t Danh sách sinh viên \n");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("| STT | Họ Và Tên \t\t\t | Tuổi | Số điện thoại \t | Email \t\t\t\t\t |");
            for (int i=0; i< arr.length ; i++) {
            System.out.printf("\n| %-3d | %-20s | %d \t| %-18s | %-25s |%n", arr[i].id, arr[i].name, arr[i].age, arr[i].phoneNumber, arr[i].email);
        }
        }

        static class Student{
            public int id;
            public String name;
            public int age;
            public String phoneNumber;
            public String email;

            public Student(int id, String name, int age, String phoneNumber, String email) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.phoneNumber = phoneNumber;
                this.email = email;
            }
        }

}

