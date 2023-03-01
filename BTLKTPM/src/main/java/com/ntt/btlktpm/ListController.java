/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.ntt.btlktpm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Thanh
 */
public class ListController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tourList = FXCollections.observableArrayList(
                new Tour("A01","TP Ho Chi Minh","Da Nang", "28/02/2023", "12h", 120000),
                new Tour("A02","TP Ho Chi Minh","Dong Nai", "28/02/2023", "12h", 140000)
        );
        maColumn.setCellValueFactory(new PropertyValueFactory<Tour, String>("maChuyen"));
        noiDiColumn.setCellValueFactory(new PropertyValueFactory<Tour, String>("noiDi"));
        noiDenColumn.setCellValueFactory(new PropertyValueFactory<Tour, String>("noiDen"));
        ngayKhoiHanhColumn.setCellValueFactory(new PropertyValueFactory<Tour, String>("ngayKhoiHanh"));
        tgKhoiHanhColumn.setCellValueFactory(new PropertyValueFactory<Tour, String>("tgKhoiHanh"));
        giaColumn.setCellValueFactory(new PropertyValueFactory<Tour, Double>("giaVe"));
        table.setItems(tourList);
        
    }    
    
    
    //quay ve trang GD Nguoiquanly
    public void ActionQuayVe() throws IOException {
        App.setRoot("primary");
    }
    
    //them chuyen di
    public void add(ActionEvent e) {
        Tour tour = new Tour();
        tour.setMaChuyen(maField.getText());
        tour.setNoiDi(noiDiField.getText());
        tour.setNoiDen(noiDenField.getText());
        tour.setNgayKhoiHanh(ngayKhoiHanhField.getText());
        tour.setTgKhoiHanh(tgKhoiHanhField.getText());
        tour.setGiaVe(Double.parseDouble(giaVeField.getText()));        
        tourList.add(tour);
        maField.setText("");
        noiDiField.setText("");
        noiDenField.setText("");
        ngayKhoiHanhField.setText("");
        tgKhoiHanhField.setText("");
        giaVeField.setText("");
    }
    
    
    //xoa chuyen di
    public void delete(ActionEvent e) {
        Tour t = table.getSelectionModel().getSelectedItem();
            tourList.remove(t);
    }
    
    //cap nhat chuyen di
    public void update(ActionEvent e) {
        Tour tour = new Tour();
        Tour t = table.getSelectionModel().getSelectedItem();
        tour.setMaChuyen(t.getMaChuyen());
        tour.setNoiDi(t.getNoiDi());
        tour.setNoiDen(t.getNoiDen());
        tour.setNgayKhoiHanh(t.getNgayKhoiHanh());
        tour.setTgKhoiHanh(t.getTgKhoiHanh());
        tour.setGiaVe(t.getGiaVe());
    }
    
    @FXML 
    private TableView<Tour> table;
    
    @FXML
    private TableColumn<Tour, String> maColumn;
    
    @FXML
    private TableColumn<Tour, String> noiDiColumn;
    
    @FXML
    private TableColumn<Tour, String> noiDenColumn;
    
    @FXML
    private TableColumn<Tour, String> ngayKhoiHanhColumn;
    
    @FXML
    private TableColumn<Tour, String> tgKhoiHanhColumn;
    
    @FXML
    private TableColumn<Tour, Double> giaColumn;
    
    private ObservableList<Tour> tourList;
    
    @FXML
    private TextField maField;
    
    @FXML
    private TextField noiDiField;
    
    @FXML
    private TextField noiDenField;
    
    @FXML
    private TextField ngayKhoiHanhField;
    
    @FXML    
    private TextField tgKhoiHanhField;
    
    @FXML
    private TextField giaVeField;
    
    
    
    
            
    
    
    
}
