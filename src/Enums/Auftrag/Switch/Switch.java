package Enums.Auftrag.Switch;

import javax.swing.plaf.PanelUI;

public class Switch {
private State state = State.OFF;

public void Push(){
    switch (state){
        case ON -> System.out.println("State is on");
        case OFF -> System.out.println("State is off");
    }
}
}
