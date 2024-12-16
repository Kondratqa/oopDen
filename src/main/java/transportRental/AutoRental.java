/*После тяжелого квартала в офисе вы решаете немного отдохнуть в отпуске. 
Поэтому вы бронируете рейс для себя и своей девушки и пытаетесь оставить весь беспорядок позади.

Вам понадобится арендованный автомобиль, чтобы передвигаться во время отпуска. Менеджер по прокату 
автомобилей делает вам несколько хороших предложений.

Каждый день аренды автомобиля стоит $40. Если вы арендуете автомобиль на 7 или более дней, 
вы получаете скидку $50 от общей суммы. В качестве альтернативы, если вы арендуете автомобиль 
на 3 или более дней, вы получаете скидку $20 от общей суммы.*/

package transportRental;

public class AutoRental {

    private int rentalDey; // Дни аренды
    private int rentalCostDey; // Стоимость аренды в день
    private int rentalDiscount1; // Скидка аренды 50
    private int rentalDiscount2; // Скидка аренды  от 3х до 7 дней 20
    private int fullRentalPriceWithDiscount; // полная стоимость аренды со скидкой

    public void setRentalDey(int newRentalDey){
        rentalDey = newRentalDey;
    }
    public void setRentalCostDey(int newRentalCostDey){
        rentalCostDey = newRentalCostDey;
    }
    public void setRentalDiscount1(int newRentalDiscount1){
        rentalDiscount1 = newRentalDiscount1;
    }
    public void setRentalDiscount2(int newRentalDiscount2){
        rentalDiscount2 = newRentalDiscount2;
    }
    public void setFullRentalPriceWithDiscount(int newFullRentalPriceWithDiscount){
        fullRentalPriceWithDiscount = newFullRentalPriceWithDiscount;
    }



    public void calculatingCarRentalDiscount(){        
        if (rentalDey >= 7 ) {
            fullRentalPriceWithDiscount = (rentalDey * rentalCostDey) - rentalDiscount1;
            System.out.println("Стоимость аренды за " + rentalDey + " дней со скидкой составляет $" + fullRentalPriceWithDiscount + " долларов США");            
        }
        
        if (rentalDey >= 3 && rentalDey <= 6) {
            fullRentalPriceWithDiscount = (rentalDey * rentalCostDey) - rentalDiscount2;
            System.out.println("Стоимость аренды за " + rentalDey + " дней со скидкой составляет $" + fullRentalPriceWithDiscount + " в день");            
        }else{
            if (rentalDey < 3) {                
                System.out.println("Если аренда меньше трех дней, придется заплатить полную стоимость аренды без скидки $" + rentalCostDey + " в день");                
            }            
        }
    }
}