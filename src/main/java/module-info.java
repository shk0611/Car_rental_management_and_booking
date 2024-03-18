module rental_car_bookking_and_management {
    requires javafx.controls;
    requires javafx.fxml;

    opens rental_car_booking_and_management to javafx.fxml;
    exports rental_car_booking_and_management;
}
