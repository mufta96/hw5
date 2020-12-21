import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.Scanner;

public class HW5 {
    /* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * Конструктор класса должен заполнять эти поля при создании объекта;
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     * Создать массив из 5 сотрудников
    */

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        //    Создать массив из 5 сотрудников
        sotrudnik[] employee = new sotrudnik[5] ;
        String name;
        String position;
        String email;
        long phone;
        float salary;
        int age;

        for (int i = 0; i<5;i++){
            in.reset();
            System.out.printf("Введите данные сотрудника %d \n" +
                    "Введите имя сотрудника\n", i+1);
            name=in.next();
            System.out.println("Введите должность сотрудника");
            position=in.next();
            System.out.println("Введите электронную почту сотрудника");
            email=in.next();
            in.reset();
            System.out.println("Введите телефон сотрудника");
            phone = in.nextLong();
            System.out.println("Введите зарплату сотрудника");
            salary = in.nextFloat();
            System.out.println("Введите возраст сотрудника");
            age = in.nextInt();
            in.reset();

            employee[i] = new sotrudnik(name,
                    position,
                    email,
                    phone,
                    salary,
                    age);
            name = null;
                    position= null;
                    email = null;
                    phone = 0;
                    salary = 0;
                    age = 0;

        }

        //* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i<5;i++){
            if(employee[i].age>40) {
                employee[i].employee_info();
            }
        }
        in.close();
    }
}
