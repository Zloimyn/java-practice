package T11_MoreInformations.Task1.T11_MoreInformTask2_final.Task2;

public class Cake {
        final private String name;
        private double weightInGrams;
        final private double pricePerKg;

        public Cake(String name, double weightInGrams, double pricePerKg) {
            this.name = name;
            this.weightInGrams = weightInGrams;
            this.pricePerKg = pricePerKg;

            System.out.println("Готов новый торт: " + name);
        }

        // узнать цену кусочка по его весу:
        public void getPiecePrice(final double pieceWeight) {
            final double price = (pricePerKg / 5000) * pieceWeight;

            System.out.println("Цена за этот кусочек: " + price + " тенге.");
        }

        // определяет, достаточно ли торта для покупки; и если да, то уменьшает вес:
        public void cutPiece(final double pieceWeight) {
            if (weightInGrams == 0) {
                System.out.println("К сожалению, этот торт уже закончился.");
            }
            if (weightInGrams < pieceWeight) {
                System.out.println("Пожалуйста, выберите кусочек поменьше.");
            }

            weightInGrams = weightInGrams - pieceWeight;

            System.out.println("Приятного аппетита!");
        }


}
