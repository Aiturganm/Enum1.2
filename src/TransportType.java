public enum TransportType {
    CAR(0.1) {
        @Override
        public double calculateTravelCost(double distance) {
            return (priceForKilometer*distance);
        }
    },
    BUS(0.05) {
        @Override
        public double calculateTravelCost(double distance) {
            return (priceForKilometer*distance);
        }
    },
    TRUCK(0.02) {
        @Override
        public double calculateTravelCost(double distance) {
            return (priceForKilometer*distance);
        }
    };

    public double priceForKilometer;
    TransportType(double priceForKilometer){
        this.priceForKilometer = priceForKilometer;
    }

    public abstract double calculateTravelCost(double distance);

}
