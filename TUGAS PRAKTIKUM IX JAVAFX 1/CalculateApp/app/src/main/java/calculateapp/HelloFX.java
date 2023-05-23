package calculateapp;

import org.checkerframework.common.reflection.qual.NewInstance;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainstage) {

        stage = mainstage;

        stage.setTitle("Kalkulator");
        stage.setScene(getScene1());
        stage.setResizable(true);
        stage.show();
    }

    private Scene getScene1() {
        // rootnot
        VBox strRoot = new VBox();
        strRoot.setAlignment(Pos.CENTER);
        // strRoot.setSpacing(20);

        // Logo
        Image logos = new Image(getClass().getClassLoader().getResourceAsStream("img/calculator.png"));
        ImageView logoscal = new ImageView(logos);
        logoscal.setFitWidth(254);
        logoscal.setFitHeight(262);
        logoscal.setPreserveRatio(true);
        logoscal.setId("logoss");
        VBox.setMargin(logoscal, new Insets(117, 185, 10, 185));

        // title
        Text title = new Text("EZZ CALCULATE");
        title.setId("namaApp");
        VBox.setMargin(title, new Insets(0, 147, 70, 147));

        // button start
        Button startss = new Button("START");
        startss.setId("tomstr");
        startss.setPrefWidth(400);
        VBox.setMargin(startss, new Insets(0, 185, 189, 185));

        // action
        startss.setOnAction(v -> {
            stage.setScene(getScene2());
        });

        // add item to root
        strRoot.getChildren().addAll(logoscal, title, startss);

        // scene1
        Scene startscene = new Scene(strRoot, 624, 810);
        startscene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        startscene.getRoot().getStyleClass().add("mysescene");
        return startscene;
    }

    private Scene getScene2() {
        // rootnot
        VBox chsRoot = new VBox();
        chsRoot.setAlignment(Pos.CENTER);
        chsRoot.setSpacing(20);

        // title
        Text title2 = new Text("PILIH MENU");
        title2.getStyleClass().add("choose");
        VBox.setMargin(title2, new Insets(20, 300, 50, 300));

        // button cal1
        Button cal1 = new Button("Konversi Uang");
        cal1.getStyleClass().add("butcalc");
        cal1.setPrefWidth(400);
        cal1.setOnAction(evn -> {
            stage.setScene(getScene3());
        });
        // VBox.setMargin(cal1, new Insets(10, 185, 10, 185));

        // button cal2
        Button cal2 = new Button("Indeks Masa Tubuh");
        cal2.getStyleClass().add("butcalc");
        cal2.setPrefWidth(400);
        cal2.setOnAction(evn -> {
            stage.setScene(getScene4());
        });
        // VBox.setMargin(cal2, new Insets(0, 0, 0, 0));

        // button call3
        Button cal3 = new Button("Persentase");
        cal3.getStyleClass().add("butcalc");
        cal3.setPrefWidth(400);
        cal3.setOnAction(evn -> {
            stage.setScene(getScene5());
        });
        // VBox.setMargin(cal3, new Insets(10, 185, 10, 185));

        // add item to root
        chsRoot.getChildren().addAll(title2, cal1, cal2, cal3);

        // scene2
        Scene sceneChoose = new Scene(chsRoot, 624, 810);
        sceneChoose.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        sceneChoose.getRoot().getStyleClass().add("mysescene");
        return sceneChoose;
    }

    private Scene getScene3() {
        // rootnot
        VBox calcl1 = new VBox();
        calcl1.setAlignment(Pos.CENTER);
        calcl1.setSpacing(20);
        calcl1.setPadding(new Insets(10, 30, 10, 30));

        // title
        Text titcal1 = new Text("Konversi Uang");
        titcal1.getStyleClass().add("choose");
        VBox.setMargin(titcal1, new Insets(20, 300, 50, 300));

        // Rupiah
        Label rupias = new Label("Rupiah");
        rupias.getStyleClass().add("wordss");
        rupias.setAlignment(Pos.CENTER_LEFT);
        TextField rpTF = new TextField();
        rpTF.getStyleClass().add("TFstyle");
        rpTF.setPromptText("Rp");

        // Dollar
        Label dolars = new Label("USD");
        dolars.getStyleClass().add("wordss");
        dolars.setAlignment(Pos.CENTER_LEFT);
        TextField usdTF = new TextField();
        usdTF.getStyleClass().add("TFstyle");
        usdTF.setPromptText("$");
        usdTF.setEditable(false);

        // button clear
        Button clr1 = new Button("Clear");
        // cal2.getStyleClass().add("butcalc");
        clr1.setPrefWidth(150);
        clr1.getStyleClass().add("clrBut");
        clr1.setOnAction(evn -> {
            rpTF.clear();
            usdTF.clear();
        });

        // button konversi
        Button cnvrt = new Button("Hitung");
        cnvrt.getStyleClass().add("htnBut");
        cnvrt.setPrefWidth(150);
        cnvrt.setOnAction(evn -> {
            try {
                Double idr = Double.parseDouble(rpTF.getText());
                Double usd = idr * 0.000067;
                usdTF.setText(String.format("$ %.2f", usd));
            } catch (Exception e) {
                usdTF.setText("Invalid Input");
            }
        });

        // hbox button
        HBox button = new HBox(clr1, cnvrt);
        button.setSpacing(10);
        button.setAlignment(Pos.CENTER);

        // button back
        Button bck1 = new Button("Back to Home");
        bck1.getStyleClass().add("bckBut");
        bck1.setPrefWidth(320);
        bck1.setOnAction(evn -> {
            stage.setScene(getScene1());
        });

        // add item to root
        calcl1.getChildren().addAll(titcal1, rupias, rpTF, dolars, usdTF, button, bck1);

        // scene3
        Scene clcScene1 = new Scene(calcl1, 624, 810);
        clcScene1.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        clcScene1.getRoot().getStyleClass().add("mysescene");
        return clcScene1;
    }

    private Scene getScene4() {
        // rootnot
        VBox calcl2 = new VBox();
        calcl2.setAlignment(Pos.CENTER);
        calcl2.setSpacing(20);
        calcl2.setPadding(new Insets(10, 30, 10, 30));

        // title
        Text titcal2 = new Text("Indeks Masa Tubuh");
        titcal2.getStyleClass().add("choose");
        VBox.setMargin(titcal2, new Insets(20, 300, 50, 300));

        // Tinggi
        Label tinggiLB = new Label("Tinggi Badan");
        tinggiLB.getStyleClass().add("wordss");
        tinggiLB.setAlignment(Pos.CENTER_LEFT);
        TextField tbTF = new TextField();
        tbTF.getStyleClass().add("TFstyle");
        tbTF.setPromptText("Meter");

        // Berat
        Label beratLB = new Label("Berat Badan");
        beratLB.getStyleClass().add("wordss");
        beratLB.setAlignment(Pos.CENTER_LEFT);
        TextField bbTF = new TextField();
        bbTF.getStyleClass().add("TFstyle");
        bbTF.setPromptText("Kilogram");

        // Hasil
        Label hsLabel = new Label("Hasil");
        hsLabel.getStyleClass().add("wordss");
        hsLabel.setAlignment(Pos.CENTER_LEFT);
        TextField hasil = new TextField();
        hasil.getStyleClass().add("TFstyle");
        hasil.setEditable(false);

        // button clear
        Button clr2 = new Button("Clear");
        clr2.getStyleClass().add("clrBut");
        clr2.setPrefWidth(150);
        clr2.setOnAction(evn -> {
            tbTF.clear();
            bbTF.clear();
            hasil.clear();
        });

        // button konversi
        Button htng = new Button("Hitung");
        htng.getStyleClass().add("htnBut");
        htng.setPrefWidth(150);
        htng.setOnAction(evn -> {
            try {
                Double tb = Double.parseDouble(tbTF.getText());

                Double bb = Double.parseDouble(bbTF.getText());
                Double imb = bb / (tb * tb);
                if (imb <= 18.5) {
                    hasil.setText("Berat Badan Kurang");
                } else if (imb >= 18.5 && imb <= 24.9) {
                    hasil.setText("Berat Badan Normal");
                } else if (imb >= 25.0 && imb <= 20.9) {
                    hasil.setText("Berat Badan Berlebih");
                } else if (imb >= 30.0) {
                    hasil.setText("Obesitas");
                }
            } catch (Exception e) {
                hasil.setText("Invalid Input");
            }
        });

        // hbox button
        HBox button1 = new HBox(clr2, htng);
        button1.setSpacing(10);
        button1.setAlignment(Pos.CENTER);

        // button back
        Button bck2 = new Button("Back to Home");
        bck2.getStyleClass().add("bckBut");
        bck2.setPrefWidth(320);
        bck2.setOnAction(evn -> {
            stage.setScene(getScene1());
        });

        // add item to root
        calcl2.getChildren().addAll(titcal2, tinggiLB, tbTF, beratLB, bbTF, hsLabel, hasil, button1, bck2);

        // scene3
        Scene clcScene2 = new Scene(calcl2, 624, 810);
        clcScene2.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        clcScene2.getRoot().getStyleClass().add("mysescene");
        return clcScene2;
    }

    private Scene getScene5() {
        // rootnot
        VBox calcl3 = new VBox();
        calcl3.setAlignment(Pos.CENTER);
        calcl3.setSpacing(20);
        calcl3.setPadding(new Insets(10, 30, 10, 30));

        // title
        Text titcal3 = new Text("Persentase");
        titcal3.getStyleClass().add("choose");
        VBox.setMargin(titcal3, new Insets(20, 300, 50, 300));

        // Persen
        Label persenLB = new Label("Persen");
        persenLB.getStyleClass().add("wordss");
        persenLB.setAlignment(Pos.CENTER_LEFT);
        TextField persenTF = new TextField();
        persenTF.getStyleClass().add("TFstyle");
        persenTF.setPromptText("%");

        // Angka
        Label angkaLB = new Label("Angka");
        angkaLB.getStyleClass().add("wordss");
        angkaLB.setAlignment(Pos.CENTER_LEFT);
        TextField angkaTF = new TextField();
        angkaTF.getStyleClass().add("TFstyle");

        // Hasil
        Label hasilLB = new Label("Hasil");
        hasilLB.getStyleClass().add("wordss");
        hasilLB.setAlignment(Pos.CENTER_LEFT);
        TextField hasilTF = new TextField();
        hasilTF.getStyleClass().add("TFstyle");
        hasilTF.setEditable(false);

        // button clear
        Button clr3 = new Button("Clear");
        clr3.getStyleClass().add("clrBut");
        clr3.setPrefWidth(150);
        clr3.setOnAction(evn -> {
            persenTF.clear();
            angkaTF.clear();
            hasilTF.clear();
        });

        // button konversi
        Button cari = new Button("Hitung");
        cari.getStyleClass().add("htnBut");
        cari.setPrefWidth(150);
        cari.setOnAction(evn -> {
            try {
                Double persentase = Double.parseDouble(persenTF.getText());
                Double num = Double.parseDouble(angkaTF.getText());
                Double persens = (persentase / 100) * num;
                hasilTF.setText(String.format("%.2f", persens));
            } catch (Exception e) {
                hasilTF.setText("Invalid Input");
            }
        });

        // hbox button
        HBox buttonss = new HBox(clr3, cari);
        buttonss.setSpacing(10);
        buttonss.setAlignment(Pos.CENTER);

        // button back
        Button bck3 = new Button("Back to Home");
        bck3.getStyleClass().add("bckBut");
        bck3.setPrefWidth(320);
        bck3.setOnAction(evn -> {
            stage.setScene(getScene1());
        });

        // add item to root
        calcl3.getChildren().addAll(titcal3, persenLB, persenTF, angkaLB, angkaTF, hasilLB, hasilTF, buttonss, bck3);

        // scene3
        Scene clcscene3 = new Scene(calcl3, 624, 810);
        clcscene3.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        clcscene3.getRoot().getStyleClass().add("mysescene");
        return clcscene3;
    }

    public static void main(String[] args) {
        launch();
    }

}