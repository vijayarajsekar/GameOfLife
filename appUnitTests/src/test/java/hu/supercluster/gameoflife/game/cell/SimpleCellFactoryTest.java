package hu.supercluster.gameoflife.game.cell;

import org.junit.Before;
import org.junit.Test;

import hu.supercluster.gameoflife.test.support.UnitTestSpecification;

import static org.fest.assertions.api.Assertions.assertThat;

public class SimpleCellFactoryTest extends UnitTestSpecification {
    SimpleCellFactory factory;

    @Before
    public void setup() {
        factory = new SimpleCellFactory();
    }

    @Test
    public void testCreate() {
        SimpleCell cell = factory.create(0, 0);
        assertThat(cell.isDead()).isTrue();
    }
}