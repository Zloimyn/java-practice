import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Test1241 extends JFrame {

    public Test1241() {
        setTitle("Трекер Задач");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());


        JLabel titleLabel = new JLabel("Меню управления", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        add(titleLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(9, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 40, 40, 40));


        addButton(buttonPanel, "Создать задачу", e -> createNewTask());
        addButton(buttonPanel, "Создать эпик", e -> createNewEpic());
        addButton(buttonPanel, "Создать подзадачу", e -> createSubTask());
        addButton(buttonPanel, "Найти задачу", e -> findTask());
        addButton(buttonPanel, "Удалить задачу", e -> deleteTask());
        addButton(buttonPanel, "Обновить задачу", e -> updateTask());
        addButton(buttonPanel, "Очистить список", e -> clearAll());
        addButton(buttonPanel, "Показать список", e -> showAllTasks());

        JButton exitBtn = new JButton("Выход");
        styleButton(exitBtn, new Color(255, 100, 100));
        exitBtn.addActionListener(e -> System.exit(0));
        buttonPanel.add(exitBtn);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }


    private void addButton(JPanel panel, String text, ActionListener action) {
        JButton btn = new JButton(text);
        styleButton(btn, new Color(100, 149, 237)); // Приятный синий цвет
        btn.addActionListener(action);
        panel.add(btn);
    }

    private void styleButton(JButton btn, Color bgColor) {
        btn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        btn.setBackground(bgColor);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    private void createNewTask() {
        String name = JOptionPane.showInputDialog(this, "Введите название задачи:");
        if (name != null && !name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Задача \"" + name + "\" создана!");
        }
    }

    private void createNewEpic() {
        JOptionPane.showMessageDialog(this, "Функция создания Эпика (подключи свою логику!)");
    }

    private void createSubTask() {
        JOptionPane.showMessageDialog(this, "Функция создания Подзадачи");
    }

    private void findTask() {
        String idStr = JOptionPane.showInputDialog(this, "Введите ID задачи:");
    }

    private void deleteTask() {
        String idStr = JOptionPane.showInputDialog(this, "Введите ID для удаления:");
    }

    private void updateTask() {
        JOptionPane.showMessageDialog(this, "Обновление задачи...");
    }

    private void clearAll() {
        int response = JOptionPane.showConfirmDialog(this, "Вы уверены?", "Очистка", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Список очищен.");
        }
    }

    private void showAllTasks() {
        JOptionPane.showMessageDialog(this, "Список задач: пока пусто");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Test1241());
    }
}
