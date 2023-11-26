/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fileexplorer;

import java.util.ArrayList;

/**
 *
 * @author muhammad
 */
public class Directory implements Path{
    
    ArrayList<Path> childs;

    String name;
    
    public Directory(String name) {
        this.name=name;
        this.childs = new ArrayList<Path>();
    }
    
    
    public void addChild(Path path)
    {
       
        childs.add(path);
    }
    
    
    public void removeChild(Path path)
    {
        int index = childs.indexOf(path);
        if(index!=-1)
            childs.remove(index);
    }

    @Override
    public String getName() {
        return this.name;      
    }

    @Override
    public float getSize() {
        float size=0;
        for (int i=0;i<childs.size();i++)
        {
            size+=childs.get(i).getSize();
        }
        return size;
    }
    
    @Override
    public String getInfo() {
        String inf= "+Directory :"+this.getName()+" "+this.getSize()+" KB\n";
            
        for (int i=0;i<childs.size();i++)
        {
          
            inf+=childs.get(i).getInfo()+"\n";
           
            
        }
      
        
        return inf;
    }
}
