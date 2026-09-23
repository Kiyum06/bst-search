import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    @Test
    void containsValueInLeftSubtree() {
        BinaryTreeNode<Integer> root =
            new BinaryTreeNode<>(10,
                new BinaryTreeNode<>(5),
                new BinaryTreeNode<>(15));

        assertTrue(BstSearch.contains(root, 5));
    }
}
