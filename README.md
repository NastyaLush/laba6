# laba5maven
Реализовать консольное приложение, которое реализует управление коллекцией объектов в интерактивном режиме. В коллекции необходимо хранить объекты класса Product, описание которого приведено ниже.

Разработанная программа должна удовлетворять следующим требованиям:

Класс, коллекцией экземпляров которого управляет программа, должен реализовывать сортировку по умолчанию.
Все требования к полям класса (указанные в виде комментариев) должны быть выполнены.
Для хранения необходимо использовать коллекцию типа java.util.HashMap
При запуске приложения коллекция должна автоматически заполняться значениями из файла.
Имя файла должно передаваться программе с помощью: переменная окружения.
Данные должны храниться в файле в формате xml
Чтение данных из файла необходимо реализовать с помощью класса java.io.FileReader
Запись данных в файл необходимо реализовать с помощью класса java.io.FileWriter
Все классы в программе должны быть задокументированы в формате javadoc.
Программа должна корректно работать с неправильными данными (ошибки пользовательского ввода, отсутсвие прав доступа к файлу и т.п.).
В интерактивном режиме программа должна поддерживать выполнение следующих команд:

help : вывести справку по доступным командам
info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)
show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении
insert null {element} : добавить новый элемент с заданным ключом
update id {element} : обновить значение элемента коллекции, id которого равен заданному
remove_key null : удалить элемент из коллекции по его ключу
clear : очистить коллекцию
save : сохранить коллекцию в файл
execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.
exit : завершить программу (без сохранения в файл)
remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный
history : вывести последние 10 команд (без их аргументов)
remove_lower_key null : удалить из коллекции все элементы, ключ которых меньше, чем заданный
remove_any_by_unit_of_measure unitOfMeasure : удалить из коллекции один элемент, значение поля unitOfMeasure которого эквивалентно заданному
average_of_manufacture_cost : вывести среднее значение поля manufactureCost для всех элементов коллекции
group_counting_by_price : сгруппировать элементы коллекции по значению поля price, вывести количество элементов в каждой группе
Формат ввода команд:

Все аргументы команды, являющиеся стандартными типами данных (примитивные типы, классы-оболочки, String, классы для хранения дат), должны вводиться в той же строке, что и имя команды.
Все составные типы данных (объекты классов, хранящиеся в коллекции) должны вводиться по одному полю в строку.
При вводе составных типов данных пользователю должно показываться приглашение к вводу, содержащее имя поля (например, "Введите дату рождения:")
Если поле является enum'ом, то вводится имя одной из его констант (при этом список констант должен быть предварительно выведен).
При некорректном пользовательском вводе (введена строка, не являющаяся именем константы в enum'е; введена строка вместо числа; введённое число не входит в указанные границы и т.п.) должно быть показано сообщение об ошибке и предложено повторить ввод поля.
Для ввода значений null использовать пустую строку.
Поля с комментарием "Значение этого поля должно генерироваться автоматически" не должны вводиться пользователем вручную при добавлении.
Описание хранимых в коллекции классов:

public class Product {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long price; //Поле не может быть null, Значение поля должно быть больше 0
    private int manufactureCost;
    private UnitOfMeasure unitOfMeasure; //Поле не может быть null
    private Person owner; //Поле может быть null
}
public class Coordinates {
    private Integer x; //Значение поля должно быть больше -233, Поле не может быть null
    private Float y; //Поле не может быть null
}
public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.ZonedDateTime birthday; //Поле не может быть null
    private int height; //Значение поля должно быть больше 0
    private Location location; //Поле не может быть null
}
public class Location {
    private long x;
    private int y;
    private String name; //Строка не может быть пустой, Поле не может быть null
}
public enum UnitOfMeasure {
    PCS,
    MILLILITERS,
    GRAMS;
}
