/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestures.Using.ExampleUse;

import Manager.Gesture.Action.VirtualAction;
import Manager.Gesture.GesturesStandards.Center;
import Manager.Gesture.GesturesStandards.Down;
import Manager.Gesture.GesturesStandards.Left;
import Manager.Gesture.GesturesStandards.Right;
import Manager.Gesture.GesturesStandards.Up;
import Manager.Gesture.Man.ManagerGA;
import Manager.Gesture.Panel.MyscreenPanel;

/**
 *
 * @author 20111lired0190
 */
public class AHandsBackwards extends VirtualAction {

    @Override
    public void run(MyscreenPanel sp, ManagerGA gerente) {
        System.out.println("hands backwards");
        Down d = new Down();
        gerente.addGestures(d);
        Adown ad = new Adown();
        gerente.addAction("Down", ad);
        Up u = new Up();
        gerente.addGestures(u);
        Aup au = new Aup();
        gerente.addAction("Up", au);
        Left l = new Left();
        gerente.addGestures(l);
        Aleft al = new Aleft();
        gerente.addAction("Left", al);
        Right r = new Right();
        gerente.addGestures(r);
        Aright ar = new Aright();
        gerente.addAction("Right", ar);
        Center c = new Center();
        gerente.addGestures(c);
        Acenter ac = new Acenter();
        gerente.addAction("Center", ac);
    }
}