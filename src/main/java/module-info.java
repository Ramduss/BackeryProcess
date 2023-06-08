module poligran.edu.bakery {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                        
    opens poligran.edu.bakery to javafx.fxml;
    exports poligran.edu.bakery;
}