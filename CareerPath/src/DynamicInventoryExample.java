import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DynamicInventoryExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fixed Size Inventory Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            createAndShowGUI(frame);
        });
    }

    private static void createAndShowGUI(JFrame frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        JButton showInventoryButton = new JButton("Show Inventory");
        mainPanel.add(showInventoryButton);

        // Create an empty list to hold the items
        List<ItemPanel> itemList = new ArrayList<>();

        // Create a panel to hold the item panels
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));

        // Create a scroll pane and add the item panel to it
        JScrollPane scrollPane = new JScrollPane(itemPanel);
        scrollPane.setPreferredSize(new Dimension(500, 350));
        scrollPane.setVisible(false); // Initially set to invisible

        mainPanel.add(scrollPane);

        showInventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a new item panel with a fixed size
                ItemPanel newItemPanel = new ItemPanel("Item " + (itemList.size() + 1));
                newItemPanel.setPreferredSize(new Dimension(300, 200)); // Set fixed size
                itemList.add(newItemPanel);

                // Add the new item panel to the item panel
                itemPanel.add(newItemPanel);

                // Make the scroll pane visible
                scrollPane.setVisible(true);

                // Repaint the frame to reflect the changes
                frame.revalidate();
                frame.repaint();
            }
        });

        frame.add(mainPanel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Custom panel for each item
    private static class ItemPanel extends JPanel {
        public ItemPanel(String itemName) {
            setLayout(new FlowLayout(FlowLayout.CENTER));
            setBackground(Color.red);
            JLabel label = new JLabel(itemName);
            JButton removeButton = new JButton("Remove");

            removeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Remove the item panel when the remove button is clicked
                    getParent().remove(ItemPanel.this);
                    revalidate();
                    repaint();
                }
            });

            add(label);
            add(removeButton);
        }
    }
}
