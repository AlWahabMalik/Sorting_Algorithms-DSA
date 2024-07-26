import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class SortAlgos {

    JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private int[] array;
    private JTextField textField_3;
    private JLabel lblNewLabel;
    private JLabel lblSortedArray;
    private JLabel lblResult;
    private JTextField textField_2;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JTextField textField_B;
    private JTextField textField_S;
    private JTextField textField_I;
    private JTextField textField_H;
    private JTextField textField_C;
    private JTextField textField_R;
    private JTextField textField_Shell;
    private JTextField textField_M;
    private JTextField textField_cycle;
    private JTextField textField_comb;
    private JLabel lblNewLabel_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SortAlgos window = new SortAlgos();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public SortAlgos() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 1042, 786);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setForeground(new Color(0, 0, 0));
        textField.setBounds(360, 159, 539, 51);
        textField.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Submit");
        btnNewButton.setForeground(new Color(128, 0, 0));
        btnNewButton.setBounds(537, 230, 130, 42);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                String[] inputArray = input.split(",");
                array = new int[inputArray.length];
                for (int i = 0; i < inputArray.length; i++) {
                    array[i] = Integer.parseInt(inputArray[i]);
                    textField_3.setText(Arrays.toString(array));
                }
                Arrays.sort(array);
                for (int i = 0; i < array.length; i++) {
                    textField_1.setText(textField_1.getText() + array[i] + ",");
                }

                long endTime1, endTime2, endTime3, endTime4, endTime5, endTime6, endTime7, endTime8, endTime9,
                        endTime10;
                long startTime1, startTime2, startTime3, startTime4, startTime5, startTime6, startTime7, startTime8,
                        startTime9, startTime10;
                double res1, res2, res3, res4, res5, res6, res7, res8, res9, res10;

                // bubble
                startTime1 = System.nanoTime();
                bubbleSort(array);
                endTime1 = System.nanoTime();
                res1 = (endTime1 - startTime1) / 1_000_000_000.0;

                // selection
                startTime2 = System.nanoTime();
                selectionSort(array);
                endTime2 = System.nanoTime();
                res2 = (endTime2 - startTime2) / 1_000_000_000.0;

                // insertion
                startTime3 = System.nanoTime();
                insertionSort(array);
                endTime3 = System.nanoTime();
                res3 = (endTime3 - startTime1) / 1_000_000_000.0;

                // heap
                startTime4 = System.nanoTime();
                heapSort(array);
                endTime4 = System.nanoTime();
                res4 = (endTime4 - startTime4) / 1_000_000_000.0;

                // count
                startTime5 = System.nanoTime();
                Countsort(array);
                endTime5 = System.nanoTime();
                res5 = (endTime5 - startTime5) / 1_000_000_000.0;

                // redix
                startTime6 = System.nanoTime();
                Radixsort(array);
                endTime6 = System.nanoTime();
                res6 = (endTime6 - startTime6) / 1_000_000_000.0;

                // shell
                startTime7 = System.nanoTime();
                Shellsort(array);
                endTime7 = System.nanoTime();
                res7 = (endTime7 - startTime7) / 1_000_000_000.0;

                // merge
                startTime8 = System.nanoTime();
                Mergsort(array);
                endTime8 = System.nanoTime();
                res8 = (endTime8 - startTime8) / 1_000_000_000.0;

                // Cycle
                startTime9 = System.nanoTime();
                Cyclesort(array);
                endTime9 = System.nanoTime();
                res9 = (endTime9 - startTime9) / 1_000_000_000.0;

                // comb
                startTime10 = System.nanoTime();
                (array);
                endTime10 = System.nanoTime();
                res10 = (endTime10 - startTime10) / 1_000_000_000.0;

                // Compairing speed of all algos
                if (res1 > res2 && res1 > res3 && res1 > res4 && res1 > res5 && res1 > res6 && res1 > res7
                        && res1 > res8 && res1 > res9 && res1 > res10) {
                    textField_2.setText("Bubble sort which take just " + res1 + " sec");
                } else if (res2 > res1 && res2 > res3 && res2 > res4 && res2 > res5 && res2 > res6 && res2 > res7
                        && res2 > res8 && res2 > res9 && res2 > res10) {
                    textField_2.setText("Selection sort which take just " + res2 + " sec");
                } else if (res3 > res1 && res3 > res2 && res3 > res4 && res3 > res5 && res3 > res6 && res3 > res7
                        && res3 > res8 && res3 > res9 && res3 > res10) {
                    textField_2.setText("Insertion sort which take just " + res3 + " sec");
                } else if (res4 > res1 && res4 > res2 && res4 > res3 && res4 > res5 && res4 > res6 && res4 > res7
                        && res4 > res8 && res4 > res9 && res4 > res10) {
                    textField_2.setText("Heap sort which take just " + res4 + " sec");
                } else if (res5 > res1 && res5 > res2 && res5 > res3 && res5 > res4 && res5 > res6 && res5 > res7
                        && res5 > res8 && res5 > res9 && res5 > res10) {
                    textField_2.setText("Count sort which take just " + res5 + " sec");
                } else if (res6 > res1 && res6 > res2 && res6 > res3 && res6 > res4 && res6 > res5 && res6 > res7
                        && res6 > res8 && res6 > res9 && res6 > res10) {
                    textField_2.setText("Redix sort which take just " + res6 + " sec");
                } else if (res7 > res1 && res7 > res2 && res7 > res3 && res7 > res4 && res7 > res5 && res7 > res6
                        && res7 > res8 && res7 > res9 && res7 > res10) {
                    textField_2.setText("Shell sort which take just " + res7 + " sec");
                } else if (res8 > res1 && res8 > res2 && res8 > res3 && res8 > res4 && res8 > res5 && res8 > res6
                        && res8 > res7 && res8 > res9 && res8 > res10) {
                    textField_2.setText("Merge sort which take just " + res8 + " sec");
                } else if (res9 > res1 && res9 > res2 && res9 > res3 && res9 > res4 && res9 > res5 && res9 > res6
                        && res9 > res7 && res9 > res8 && res9 > res10) {
                    textField_2.setText("Cycle sort which take just " + res9 + " sec");
                } else if (res10 > res1 && res10 > res2 && res10 > res3 && res10 > res4 && res10 > res5 && res10 > res6
                        && res10 > res7 && res10 > res8 && res10 > res9) {
                    textField_2.setText("Combat sort which take just " + res10 + " sec");
                }
                textField_B.setText(res1 + " s");
                textField_S.setText(res2 + " s");
                textField_I.setText(res3 + " s");
                textField_H.setText(res4 + " s");
                textField_C.setText(res5 + " s");
                textField_R.setText(res6 + " s");
                textField_Shell.setText(res7 + " s");
                textField_M.setText(res8 + " s");
                textField_cycle.setText(res9 + " s");
                textField_comb.setText(res10 + " s");
            }
        });
        frame.getContentPane().add(btnNewButton);

        textField_1 = new JTextField();
        textField_1.setBounds(360, 375, 539, 51);
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(360, 302, 539, 51);
        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
        textField_3.setColumns(10);
        frame.getContentPane().add(textField_3);

        lblNewLabel = new JLabel("Entered Array");
        lblNewLabel.setBounds(134, 300, 138, 51);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(lblNewLabel);

        lblSortedArray = new JLabel("Sorted Array");
        lblSortedArray.setBounds(134, 373, 138, 51);
        lblSortedArray.setHorizontalAlignment(SwingConstants.CENTER);
        lblSortedArray.setFont(new Font("Tahoma", Font.BOLD, 20));
        frame.getContentPane().add(lblSortedArray);

        lblResult = new JLabel("Fastest algo");
        lblResult.setBounds(134, 446, 138, 51);
        lblResult.setHorizontalAlignment(SwingConstants.CENTER);
        lblResult.setFont(new Font("Tahoma", Font.BOLD, 20));
        frame.getContentPane().add(lblResult);

        textField_2 = new JTextField();
        textField_2.setBounds(360, 448, 539, 51);
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        textField_2.setColumns(10);
        frame.getContentPane().add(textField_2);

        lblNewLabel_1 = new JLabel("Faster Sorting Checker");
        lblNewLabel_1.setBackground(new Color(240, 240, 240));
        lblNewLabel_1.setForeground(new Color(128, 0, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 48));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(153, 10, 687, 104);
        frame.getContentPane().add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("Enter the Array");
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(76, 158, 230, 51);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField_1.setText(null);
                textField_2.setText(null);
                textField_3.setText(null);
                textField.setText(null);
                textField_S.setText(null);
                textField_I.setText(null);
                textField_H.setText(null);
                textField_C.setText(null);
                textField_R.setText(null);
                textField_B.setText(null);
                textField_Shell.setText(null);
                textField_M.setText(null);
                textField_cycle.setText(null);
                textField_comb.setText(null);
            }
        });
        btnReset.setForeground(new Color(128, 0, 0));
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnReset.setBounds(683, 230, 138, 42);
        frame.getContentPane().add(btnReset);

        JLabel lblNewLabel_3 = new JLabel("Bubble Sort");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3.setBounds(10, 557, 130, 42);
        frame.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_3_1 = new JLabel("Selection Sort");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_3_1.setBounds(10, 619, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_1);

        JLabel lblNewLabel_3_2 = new JLabel("Insertion Sort");
        lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_3_2.setBounds(10, 681, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_2);

        JLabel lblNewLabel_3_3 = new JLabel("Heap Sort");
        lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3_3.setBounds(282, 557, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_3);

        JLabel lblNewLabel_3_4 = new JLabel("Count Sort");
        lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3_4.setBounds(282, 619, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_4);

        JLabel lblNewLabel_3_5 = new JLabel("Redix Sort");
        lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3_5.setBounds(282, 681, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_5);

        JLabel lblNewLabel_3_6 = new JLabel("Sehll Sort");
        lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3_6.setBounds(537, 557, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_6);

        JLabel lblNewLabel_3_7 = new JLabel("Merge Sort");
        lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_7.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3_7.setBounds(537, 619, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_7);

        JLabel lblNewLabel_3_8 = new JLabel("Cycle Sort");
        lblNewLabel_3_8.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_8.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3_8.setBounds(537, 681, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_8);

        JLabel lblNewLabel_3_9 = new JLabel("Comb Sort");
        lblNewLabel_3_9.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_9.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel_3_9.setBounds(769, 557, 130, 42);
        frame.getContentPane().add(lblNewLabel_3_9);

        textField_B = new JTextField();
        textField_B.setForeground(new Color(128, 0, 0));
        textField_B.setHorizontalAlignment(SwingConstants.CENTER);
        textField_B.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_B.setBounds(150, 557, 122, 42);
        frame.getContentPane().add(textField_B);
        textField_B.setColumns(10);

        textField_S = new JTextField();
        textField_S.setForeground(new Color(128, 0, 0));
        textField_S.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_S.setHorizontalAlignment(SwingConstants.CENTER);
        textField_S.setColumns(10);
        textField_S.setBounds(150, 619, 122, 42);
        frame.getContentPane().add(textField_S);

        textField_I = new JTextField();
        textField_I.setForeground(new Color(128, 0, 0));
        textField_I.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_I.setHorizontalAlignment(SwingConstants.CENTER);
        textField_I.setColumns(10);
        textField_I.setBounds(150, 681, 122, 42);
        frame.getContentPane().add(textField_I);

        textField_H = new JTextField();
        textField_H.setForeground(new Color(128, 0, 0));
        textField_H.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_H.setHorizontalAlignment(SwingConstants.CENTER);
        textField_H.setColumns(10);
        textField_H.setBounds(402, 560, 122, 42);
        frame.getContentPane().add(textField_H);

        textField_C = new JTextField();
        textField_C.setForeground(new Color(128, 0, 0));
        textField_C.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_C.setHorizontalAlignment(SwingConstants.CENTER);
        textField_C.setColumns(10);
        textField_C.setBounds(402, 619, 122, 42);
        frame.getContentPane().add(textField_C);

        textField_R = new JTextField();
        textField_R.setForeground(new Color(128, 0, 0));
        textField_R.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_R.setHorizontalAlignment(SwingConstants.CENTER);
        textField_R.setColumns(10);
        textField_R.setBounds(402, 681, 122, 42);
        frame.getContentPane().add(textField_R);

        textField_Shell = new JTextField();
        textField_Shell.setForeground(new Color(128, 0, 0));
        textField_Shell.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_Shell.setHorizontalAlignment(SwingConstants.CENTER);
        textField_Shell.setColumns(10);
        textField_Shell.setBounds(661, 557, 112, 42);
        frame.getContentPane().add(textField_Shell);

        textField_M = new JTextField();
        textField_M.setForeground(new Color(128, 0, 0));
        textField_M.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_M.setHorizontalAlignment(SwingConstants.CENTER);
        textField_M.setColumns(10);
        textField_M.setBounds(661, 619, 112, 42);
        frame.getContentPane().add(textField_M);

        textField_cycle = new JTextField();
        textField_cycle.setForeground(new Color(128, 0, 0));
        textField_cycle.setHorizontalAlignment(SwingConstants.CENTER);
        textField_cycle.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_cycle.setColumns(10);
        textField_cycle.setBounds(661, 681, 112, 42);
        frame.getContentPane().add(textField_cycle);

        textField_comb = new JTextField();
        textField_comb.setForeground(new Color(128, 0, 0));
        textField_comb.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField_comb.setHorizontalAlignment(SwingConstants.CENTER);
        textField_comb.setColumns(10);
        textField_comb.setBounds(896, 557, 122, 42);
        frame.getContentPane().add(textField_comb);

        lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setOpaque(true);
        lblNewLabel_4.setBackground(new Color(102, 205, 170));
        lblNewLabel_4.setBounds(0, 0, 1028, 749);
        frame.getContentPane().add(lblNewLabel_4);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // selection sort method
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;// searching for lowest index
                }
            }
            int smallerNumber = array[minIndex];
            array[minIndex] = array[i];
            array[i] = smallerNumber;
        }
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public void heapSort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public static void Countsort(int[] array) {
        int maxVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }

        int[] countArray = new int[maxVal + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }

        int currentIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                array[currentIndex++] = i;
            }
        }
    }

    public static void Radixsort(int[] array) {
        int maxVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        int exp = 1;
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        while (maxVal / exp > 0) {
            Arrays.fill(count, 0);
            for (int i = 0; i < n; i++) {
                count[(array[i] / exp) % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                output[count[(array[i] / exp) % 10] - 1] = array[i];
                count[(array[i] / exp) % 10]--;
            }
            for (int i = 0; i < n; i++) {
                array[i] = output[i];
            }
            exp *= 10;
        }
    }

    public static void Shellsort(int[] array) {
        int gap = array.length / 2;
        while (gap > 0) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
            gap /= 2;
        }
    }

    public static void Mergsort(int[] array) {
        int[] temp = new int[array.length];
        sort(array, temp, 0, array.length - 1);
    }

    private static void sort(int[] array, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        sort(array, temp, left, middle);
        sort(array, temp, middle + 1, right);
        merge(array, temp, left, middle, right);
    }

    private static void merge(int[] array, int[] temp, int left, int middle, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = array[i];
        }
        int i = left;
        int j = middle + 1;
        int k = left;
        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }
    }

    public static void Cyclesort(int[] arr) {
        int n = arr.length;
        for (int cycleStart = 0; cycleStart <= n - 2; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }
            if (pos == cycleStart) {
                continue;
            }
            while (item == arr[pos]) {
                pos += 1;
            }
            if (pos != cycleStart) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos += 1;
                    }
                }
                while (item == arr[pos]) {
                    pos += 1;
                }
                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }

    public static void insertionSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void combSort(int[] arr) {
        int n = arr.length;
        int gap = n;
        double shrink = 1.3;
        boolean sorted = false;
        while (!sorted) {
            gap = (int) (gap / shrink);
            if (gap > 1) {
                sorted = false;
            } else {
                gap = 1;
                sorted = true;
            }
            int i = 0;
            while ((i + gap) < n) {
                if (arr[i] > arr[i + gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i + gap];
                    arr[i + gap] = temp;
                    sorted = false;
                }
                i++;
            }
        }
    }
}
