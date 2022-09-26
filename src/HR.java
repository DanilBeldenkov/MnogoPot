class PeopleStud extends Thread    {
    private String[] names;

    PeopleStud(String... names) {// Конструктор, аргумент- массив имен сотрудников
        this.names = names;
    }

    @Override
    public void run() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Опаздали без причины: " + names[i]);
            try {
                sleep(1000);
            } catch (Exception e) {}
        }
    }
}

public class HR    {
    public static void main(String[] args) {
        // Создаем две очереди
        PeopleStud queue1 = new PeopleStud("Никита","Миша","Артём","Денис","Данил");
        PeopleStud queue2 = new PeopleStud("Мария","Ирина","Таня","Настя","Лида");

        System.out.println("Где группа 21ИТ35?");
        queue1.start();
        queue2.start();
    }
}