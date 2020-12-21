//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
public class sotrudnik {
    String name;
    String position;
    String email;
    long phone;
    float salary;
    int age;

    // Конструктор класса должен заполнять эти поля при создании объекта;
    public sotrudnik(String _name, String _position, String _email,
                     long _phone, float _salary, int _age) {
        name = _name;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    // Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    void employee_info() {
        System.out.printf('\n' + this.name + '\n' + this.position + '\n' + this.email + '\n' + this.phone + '\n'
                + this.salary + '\n' + this.age + '\n');
        //System.out.println(this);
    }

}
