package animalFood;
/*Создайте класс Animal, который будет представлять животное. Класс должен иметь следующие свойства:
• name (имя животного),
• age (возраст животного),
• weight (вес животного в килограммах).

Требования:
1. Реализуйте конструктор для инициализации имени, возраста и веса животного.
2. Добавьте методы get и set для каждого из свойств: name, age и weight.
3. Реализуйте метод calculateFoodRequirement, который будет вычислять необходимое количество корма для животного. 
   Предположим, что животному требуется 5% от его веса в килограммах в день. 
   Метод должен возвращать количество корма, необходимое для одного дня.
4. Реализуйте метод celebrateBirthday, который будет увеличивать возраст животного на один год. */
public class Animal {
   private String name;
   private int age;
   private double weight;

   public Animal(String name, int age, double weight){
      this.name = name;
      this.age = age;
      this.weight = weight;      
   }

   public void calculateFoodRequirement(){
      double amountFeedDay;
      amountFeedDay = (double) ((weight * 5) / 100);
      
      System.out.println("Нашему бычку по имени " + name + " " + age + " года, его вес " + weight +" кг, в день ему требуется " + amountFeedDay + " кг комбикорма");
   
   }
   public void celebrateBirthday(){
      age++;      
      
      System.out.println("У нашего бычка " + name + " сегодня день рождения и ему исполняется " + age + " лет");      
   
   }
   public void calculateFoodRequirement1(){
      double amountFeedDay;
      weight = weight + 22.3;
      amountFeedDay = (double) ((weight * 5) / 100);      
      
      System.out.println("Нашему бычку по имени " + name + " теперь " + age + " лет, и в день теперь ему требуется " + amountFeedDay + " кг комбикорма");
      System.out.println("Наш бычек в " + age + " лет весит " + weight + " кг");
   }
}
