public class Cat {
    private int weight; //Вес кота
    private String name; //Имя
    private String color; //Цвет кота

    //кот есть

    public void eat(){
        System.out.println("Eating...\n");
    }

    //кот спит
    public void sleep(){
        System.out.println("Sleeping zz-z-z-z...\n");
    }

    //кот разговаривает
    public String speak(String words){
        String phrase = words + "...mauu...\n";
        return phrase;

    }

}
