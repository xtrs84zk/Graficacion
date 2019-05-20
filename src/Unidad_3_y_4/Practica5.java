package Unidad_3_y_4;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Practica5 extends Application {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Tierra
        Image image_diffuse = new Image(getClass().getResource("tierra.jpg").toExternalForm());
        Color color_luz = null;
        PhongMaterial m1 = new PhongMaterial();
        m1.setSpecularColor(color_luz);
        m1.setSpecularPower(64);
        m1.setDiffuseMap(image_diffuse);

        Sphere sp1 = new Sphere(150, 150);
        sp1.setTranslateX(480);
        sp1.setTranslateY(650);
        sp1.setMaterial(m1);
        sp1.setDrawMode(DrawMode.FILL);
        sp1.setCullFace(CullFace.BACK);
        //Death Star
        Image image_diffuse2 = new Image(getClass().getResource("deathstar.jpg").toExternalForm());
        Color colorLuz1 = null;
        PhongMaterial m2 = new PhongMaterial();
        m2.setSpecularColor(colorLuz1);
        m2.setSpecularPower(64);
        m2.setDiffuseMap(image_diffuse2);

        Sphere ds = new Sphere(100, 100);
        ds.setTranslateX(780);
        ds.setTranslateY(150);
        ds.setMaterial(m2);
        ds.setDrawMode(DrawMode.FILL);
        ds.setCullFace(CullFace.BACK);
        //Mon
        Image image_diffuse3 = new Image(getClass().getResource("luna.jpg").toExternalForm());
        Color colorluz2 = null;
        PhongMaterial m3 = new PhongMaterial();
        m3.setSpecularColor(colorluz2);
        m3.setSpecularPower(64);
        m3.setDiffuseMap(image_diffuse3);

        Sphere L = new Sphere(110, 110);

        L.setTranslateX(180);
        L.setTranslateY(320);
        L.setMaterial(m3);
        L.setDrawMode(DrawMode.FILL);
        L.setCullFace(CullFace.BACK);

        //estrellas
        PhongMaterial pm = new PhongMaterial();
        pm.setDiffuseColor(Color.GRAY);
        pm.setSpecularColor(Color.rgb(0, 0, 0));
        Sphere s = new Sphere(5f);
        s.setMaterial(pm);
        s.setTranslateX(30);
        s.setTranslateY(320);
        Sphere s1 = new Sphere(5f);
        s1.setMaterial(pm);
        s1.setTranslateX(380);
        s1.setTranslateY(320);

        Sphere s2 = new Sphere(5f);
        s2.setMaterial(pm);
        s2.setTranslateX(10);
        s2.setTranslateY(20);
        Sphere s3 = new Sphere(5f);
        s3.setMaterial(pm);
        s3.setTranslateX(200);
        s3.setTranslateY(20);
        Sphere s4 = new Sphere(5f);
        s4.setMaterial(pm);
        s4.setTranslateX(300);
        s4.setTranslateY(120);
        Sphere s5 = new Sphere(5f);
        s5.setMaterial(pm);
        s5.setTranslateX(100);
        s5.setTranslateY(90);
        Sphere s6 = new Sphere(5f);
        s6.setMaterial(pm);
        s6.setTranslateX(50);
        s6.setTranslateY(190);
        Sphere s7 = new Sphere(5f);
        s7.setMaterial(pm);
        s7.setTranslateX(550);
        s7.setTranslateY(290);
        Sphere s8 = new Sphere(5f);
        s8.setMaterial(pm);
        s8.setTranslateX(660);
        s8.setTranslateY(190);
        Sphere s9 = new Sphere(5f);
        s9.setMaterial(pm);
        s9.setTranslateX(890);
        s9.setTranslateY(190);
        Sphere s10 = new Sphere(5f);
        s10.setMaterial(pm);
        s10.setTranslateX(490);
        s10.setTranslateY(190);
        Sphere s11 = new Sphere(5f);
        s11.setMaterial(pm);
        s11.setTranslateX(390);
        s11.setTranslateY(190);
        Sphere s12 = new Sphere(5f);
        s12.setMaterial(pm);
        s12.setTranslateX(390);
        s12.setTranslateY(50);
        Sphere s13 = new Sphere(5f);
        s13.setMaterial(pm);
        s13.setTranslateX(490);
        s13.setTranslateY(90);
        Sphere s14 = new Sphere(5f);
        s14.setMaterial(pm);
        s14.setTranslateX(690);
        s14.setTranslateY(20);
        Sphere s15 = new Sphere(5f);
        s15.setMaterial(pm);
        s15.setTranslateX(990);
        s15.setTranslateY(20);
        Sphere s16 = new Sphere(5f);
        s16.setMaterial(pm);
        s16.setTranslateX(880);
        s16.setTranslateY(20);
        Sphere s17 = new Sphere(5f);
        s17.setMaterial(pm);
        s17.setTranslateX(880);
        s17.setTranslateY(20);
        Sphere s18 = new Sphere(5f);
        s18.setMaterial(pm);
        s18.setTranslateX(330);
        s18.setTranslateY(20);
        Sphere s19 = new Sphere(5f);
        s19.setMaterial(pm);
        s19.setTranslateX(850);
        s19.setTranslateY(20);
        Sphere s20 = new Sphere(5f);
        s20.setMaterial(pm);
        s20.setTranslateX(370);
        s20.setTranslateY(150);
        Sphere s21 = new Sphere(5f);
        s21.setMaterial(pm);
        s21.setTranslateX(430);
        s21.setTranslateY(470);
        Sphere s22 = new Sphere(5f);
        s22.setMaterial(pm);
        s22.setTranslateX(30);
        s22.setTranslateY(360);
        Sphere s23 = new Sphere(5f);
        s23.setMaterial(pm);
        s23.setTranslateX(330);
        s23.setTranslateY(480);
        Sphere s24 = new Sphere(5f);
        s24.setMaterial(pm);
        s24.setTranslateX(630);
        s24.setTranslateY(520);
        Sphere s25 = new Sphere(5f);
        s25.setMaterial(pm);
        s25.setTranslateX(30);
        s25.setTranslateY(620);
        Sphere s26 = new Sphere(5f);
        s26.setMaterial(pm);
        s26.setTranslateX(30);
        s26.setTranslateY(720);
        Sphere s27 = new Sphere(5f);
        s27.setMaterial(pm);
        s27.setTranslateX(929);
        s27.setTranslateY(655);
        Sphere s28 = new Sphere(5f);
        s28.setMaterial(pm);
        s28.setTranslateX(929);
        s28.setTranslateY(635);
        Sphere s29 = new Sphere(5f);
        s29.setMaterial(pm);
        s29.setTranslateX(629);
        s29.setTranslateY(355);
        Sphere s30 = new Sphere(5f);
        s30.setMaterial(pm);
        s30.setTranslateX(729);
        s30.setTranslateY(555);
        Sphere s31 = new Sphere(5f);
        s31.setMaterial(pm);
        s31.setTranslateX(700);
        s31.setTranslateY(500);
        Sphere s32 = new Sphere(5f);
        s32.setMaterial(pm);
        s32.setTranslateX(529);
        s32.setTranslateY(255);
        Sphere s33 = new Sphere(5f);
        s33.setMaterial(pm);
        s33.setTranslateX(129);
        s33.setTranslateY(435);
        Sphere s34 = new Sphere(5f);
        s34.setMaterial(pm);
        s34.setTranslateX(729);
        s34.setTranslateY(435);
        Sphere s35 = new Sphere(5f);
        s35.setMaterial(pm);
        s35.setTranslateX(929);
        s35.setTranslateY(435);
        Sphere s36 = new Sphere(5f);
        s36.setMaterial(pm);
        s36.setTranslateX(829);
        s36.setTranslateY(635);
        Sphere s37 = new Sphere(5f);
        s37.setMaterial(pm);
        s37.setTranslateX(10);
        s37.setTranslateY(600);
        Sphere s38 = new Sphere(5f);
        s38.setMaterial(pm);
        s38.setTranslateX(829);
        s38.setTranslateY(635);
        Sphere s39 = new Sphere(5f);
        s39.setMaterial(pm);
        s39.setTranslateX(50);
        Sphere s40 = new Sphere(5f);
        s40.setMaterial(pm);
        s40.setTranslateX(120);
        s40.setTranslateY(625);

        Group root = new Group(sp1, ds, L, s, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23
                , s24, s25, s26, s27, s28, s29, s30, s31, s32, s33, s34, s35, s36, s37, s38, s39, s40);
        Scene scene = new Scene(root, 1000, 1000, Color.BLACK);


        primaryStage.setTitle("Space");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

