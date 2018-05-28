public class HelloWorld {
        /**
         * @param args
         */
        public static void main (String [] args){
                Cat ourcat = new Cat();

                ourcat.eat();
                ourcat.sleep();
                String say = ourcat.speak("Tanya");
                System.out.println(say);

                Dog ourdog = new Dog();

                ourdog.eat();
                ourdog.guard();
                ourdog.run();

        }
}
