/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charlie.bs.section1;

import charlie.advisor.Advisor;
import charlie.card.Card;
import static charlie.card.Card.Suit.*;
import charlie.card.Hand;
import charlie.card.Hid;
import static charlie.dealer.Seat.*;
import charlie.util.Play;
import static charlie.util.Play.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Thomas Wojnar, Garrett Oreilly
 */
public class Test00_12_06 {
    
    public Test00_12_06() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test00()
    {
        Hid hid = new Hid(YOU, 0.0, 0.0);
        Card card1 = new Card(4, HEARTS);
        Card card2 = new Card(8, DIAMONDS);
        Card upCard = new Card(2, SPADES);
        Hand userHand = new Hand(hid);
        userHand.hit(card1);
        userHand.hit(card2);
        Advisor advisor = new Advisor();
        Play result = advisor.advise(userHand, upCard);
        Play expected = HIT;
        assertEquals(result, expected);
    }
}
