/*После тяжелого квартала в офисе вы решаете немного отдохнуть в отпуске. 
Поэтому вы бронируете рейс для себя и своей девушки и пытаетесь оставить весь беспорядок позади.

Вам понадобится арендованный автомобиль, чтобы передвигаться во время отпуска. Менеджер по прокату 
автомобилей делает вам несколько хороших предложений.

Каждый день аренды автомобиля стоит $40. Если вы арендуете автомобиль на 7 или более дней, 
вы получаете скидку $50 от общей суммы. В качестве альтернативы, если вы арендуете автомобиль 
на 3 или более дней, вы получаете скидку $20 от общей суммы. */

package transportRental;

public class AutoRental {

    public int rentalDey; // Дни аренды
    public int rentalCostDey; // Стоимость аренды в день
    public int rentalDiscount1; // Скидка аренды 50
    public int rentalDiscount2; // Скидка аренды  от 3х до 7 дней 20
    public int fullRentalPriceWithDiscount; // полная стоимость аренды со скидкой

    public void calculatingCarRentalDiscount(){        
        if (rentalDey >= 7 ) {
            fullRentalPriceWithDiscount = (rentalDey * rentalCostDey) - rentalDiscount1;
            System.out.println("Стоимость аренды за " + rentalDey + " дней со скидкой составляет $" + fullRentalPriceWithDiscount + " в день");            
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