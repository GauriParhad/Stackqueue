import jdk.jfr.StackTrace;
import org.junit.Assert;
import org.junit.Test;


public class StackQueue {
    @Test
    public void given3NumbersWhenLinkedShouldPassedLinkedListTest(){
        MyNode<Integer>myFirstNode=new MyNODE<>(key:56);
        MyNode<Integer>mySecondNode=new MyNODE<>(key:30);
        MyNode<Integer>myThirdNode=new MyNODE<>(key:70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result=myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        StackQueue.pop();
        Assert.assertTrue(result);

    }
}
}
@Test
//pop all the elements//
public class Poppingstack{
    public void poppingstack(){
        MyNode<Integer>myFirstNode=new MyNODE<>(key:56);
        MyNode<Integer>mySecondNode=new MyNODE<>(key:30);
        MyNode<Integer>myThirdNode=new MyNODE<>(key:70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        myLinkedList.pop();
        myLinkedList.pop();
        myLinkedList.pop();
        Assert.assertTrue(res
        boolean result=myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);

    }
}
