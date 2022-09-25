/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern;

/**
 *
 * @author lgpc
 */
public class CompositeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MenuComponent DaeguMenu = new Menu("대구");
        MenuComponent SeoulMenu = new Menu("서울");
        MenuComponent TokyoMenu = new Menu("도쿄");
        MenuComponent JejuMenu = new Menu("제주");
        MenuComponent ParisMenu = new Menu("파리");
        MenuComponent allMenu = new Menu("전체");
                
        allMenu.add(SeoulMenu);
        allMenu.add(TokyoMenu);
        allMenu.add(JejuMenu);
        allMenu.add(ParisMenu);
        allMenu.add(DaeguMenu);
        
        System.out.println(DaeguMenu.getChild(0).getPlace());
        allMenu.print();
        
    }
    
}
