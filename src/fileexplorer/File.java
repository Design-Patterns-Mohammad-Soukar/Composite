/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileexplorer;

/**
 *
 * @author muhammad
 */
public class File implements Path{
    String name;
    float size;
    
    public File(String name,float size){
        this.name=name;
        this.size=size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getSize() {
        return this.size;
    }

    @Override
    public String getInfo() {
        return "-File :"+this.getName()+" "+this.getSize()+" KB";
    }
}
