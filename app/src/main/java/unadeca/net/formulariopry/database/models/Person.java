package unadeca.net.formulariopry.database.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import unadeca.net.formulariopry.database.PersonApp;


@Table(database = PersonApp.class)
public class Person extends BaseModel {
    @Column
    @PrimaryKey (autoincrement = true)
    public int id;

    @Column
    public String nombre;

    @Column
    public String apellido;

    @Column
    public  int edad;

    @Column
    public String pais;

    @Column String ocupacion;


}
