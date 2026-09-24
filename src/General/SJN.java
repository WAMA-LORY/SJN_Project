/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package General;


public class SJN extends javax.swing.JFrame {

 
    public SJN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProcessTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Input_Process = new javax.swing.JTextField();
        SetProcessNum = new javax.swing.JButton();
        Calculate = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Outputfield = new javax.swing.JTextArea();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ProcessTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Arrival Time", "Burst Time"
            }
        ));
        jScrollPane1.setViewportView(ProcessTable);

        jLabel1.setText("Input Number of Processes");

        Input_Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_ProcessActionPerformed(evt);
            }
        });

        SetProcessNum.setText("Set to Table");
        SetProcessNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetProcessNumActionPerformed(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Outputfield.setColumns(20);
        Outputfield.setRows(5);
        jScrollPane2.setViewportView(Outputfield);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Input_Process, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(SetProcessNum))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Input_Process, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetProcessNum))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Calculate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Input_ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_ProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_ProcessActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
                                                
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ProcessTable.getModel();
    int rowCount = model.getRowCount();

    if (rowCount == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please set process count and populate the table first.", "Warning", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    java.util.Stack<Process> inputStack = new java.util.Stack<>();

    // Read and validate table cell inputs
    try {
        for (int i = 0; i < rowCount; i++) {
            String pid = model.getValueAt(i, 0).toString();
            int at = Integer.parseInt(model.getValueAt(i, 1).toString().trim());
            int bt = Integer.parseInt(model.getValueAt(i, 2).toString().trim());

            if (at < 0 || bt <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Arrival Time must be >= 0 and Burst Time must be > 0.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            inputStack.push(new Process(pid, at, bt));
        }
    } catch (Exception ex) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter valid integers in all Arrival and Burst Time cells.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Sort arrival queue by Arrival Time
    java.util.Queue<Process> arrivalQueue = new java.util.LinkedList<>();
    java.util.List<Process> sortedList = new java.util.ArrayList<>();
    while (!inputStack.isEmpty()) {
        sortedList.add(inputStack.pop());
    }
    sortedList.sort(java.util.Comparator.comparingInt(p -> p.arrivalTime));
    arrivalQueue.addAll(sortedList);

    java.util.List<Process> readyQueue = new java.util.ArrayList<>();
    java.util.List<Process> completedProcesses = new java.util.ArrayList<>();
    java.util.List<GanttBlock> ganttChart = new java.util.ArrayList<>();

    int currentTime = arrivalQueue.isEmpty() ? 0 : arrivalQueue.peek().arrivalTime;

    // SJN Core Logic
    while (completedProcesses.size() < rowCount) {
        while (!arrivalQueue.isEmpty() && arrivalQueue.peek().arrivalTime <= currentTime) {
            readyQueue.add(arrivalQueue.poll());
        }

        if (readyQueue.isEmpty()) {
            currentTime = arrivalQueue.peek().arrivalTime;
            continue;
        }

        readyQueue.sort(java.util.Comparator.comparingInt(p -> p.burstTime));
        Process currentProcess = readyQueue.remove(0);

        currentProcess.startTime = currentTime;
        currentProcess.waitingTime = currentProcess.startTime - currentProcess.arrivalTime;
        currentTime += currentProcess.burstTime;

        completedProcesses.add(currentProcess);
        ganttChart.add(new GanttBlock(currentProcess.pid, currentProcess.startTime, currentTime));
    }

    // Format output string for Outputfield
    completedProcesses.sort((p1, p2) -> {
        int id1 = Integer.parseInt(p1.pid.substring(1));
        int id2 = Integer.parseInt(p2.pid.substring(1));
        return Integer.compare(id1, id2);
    });

    StringBuilder sb = new StringBuilder();
    sb.append("==================================================\n");
    sb.append(" Process | Arrival | Burst | Start Time | Waiting \n");
    sb.append("==================================================\n");

    double totalWT = 0;
    for (Process p : completedProcesses) {
        totalWT += p.waitingTime;
        sb.append(String.format("   %-5s |    %-4d |   %-3d |     %-6d |   %-4d\n",
                p.pid, p.arrivalTime, p.burstTime, p.startTime, p.waitingTime));
    }

    sb.append("==================================================\n");
    sb.append(String.format("Average Waiting Time (AWT) : %.2f\n", (totalWT / completedProcesses.size())));
    sb.append("==================================================\n\n");

    // Print Gantt Chart
    sb.append("GANTT CHART:\n");
    for (GanttBlock block : ganttChart) {
        sb.append("+--------");
    }
    sb.append("+\n");

    for (GanttBlock block : ganttChart) {
        sb.append(String.format("|  %-5s ", block.pid));
    }
    sb.append("|\n");

    for (GanttBlock block : ganttChart) {
        sb.append("+--------");
    }
    sb.append("+\n");

    if (!ganttChart.isEmpty()) {
        sb.append(ganttChart.get(0).startTime);
        for (GanttBlock block : ganttChart) {
            sb.append(String.format("%8d", block.endTime));
        }
    }
    sb.append("\n");

    Outputfield.setText(sb.toString());

    }//GEN-LAST:event_CalculateActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
                                             
    Input_Process.setText("");
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ProcessTable.getModel();
    model.setRowCount(0);
    Outputfield.setText("");

    }//GEN-LAST:event_ResetActionPerformed

    private void SetProcessNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetProcessNumActionPerformed
                                       
    try {
        int count = Integer.parseInt(Input_Process.getText().trim());
        if (count <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a process count greater than 0.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ProcessTable.getModel();
        model.setRowCount(0); // Clear existing rows

        for (int i = 1; i <= count; i++) {
            model.addRow(new Object[]{"P" + i, "", ""});
        }
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid integer number of processes.", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_SetProcessNumActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SJN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SJN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate;
    private javax.swing.JTextField Input_Process;
    private javax.swing.JTextArea Outputfield;
    private javax.swing.JTable ProcessTable;
    private javax.swing.JButton Reset;
    private javax.swing.JButton SetProcessNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
// End of variables declaration                   

    static class Process {
        String pid;
        int arrivalTime;
        int burstTime;
        int startTime;
        int waitingTime;

        public Process(String pid, int arrivalTime, int burstTime) {
            this.pid = pid;
            this.arrivalTime = arrivalTime;
            this.burstTime = burstTime;
        }
    }

    static class GanttBlock {
        String pid;
        int startTime;
        int endTime;

        public GanttBlock(String pid, int startTime, int endTime) {
            this.pid = pid;
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}



