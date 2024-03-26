package folder;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class NewJPanel extends javax.swing.JPanel {

    @Override
    public boolean requestFocusInWindow() {
        return super.requestFocusInWindow();
    }

    public NewJPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TeclaDo = new javax.swing.JButton();
        Clicar = new javax.swing.JRadioButton();
        PasarRaton = new javax.swing.JRadioButton();
        OpcionTeclado = new javax.swing.JRadioButton();
        TeclaRe = new javax.swing.JButton();
        Gato = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(204, 204, 255));
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                formInputMethodTextChanged(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        TeclaDo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TeclaDoMouseEntered(evt);
            }
        });
        TeclaDo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TeclaDoInputMethodTextChanged(evt);
            }
        });
        TeclaDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaDoActionPerformed(evt);
            }
        });
        TeclaDo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeclaDoKeyPressed(evt);
            }
        });

        Clicar.setText("Clicar");
        Clicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClicarActionPerformed(evt);
            }
        });

        PasarRaton.setText("Pasar Raton");
        PasarRaton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasarRatonActionPerformed(evt);
            }
        });

        OpcionTeclado.setText("Teclado");
        OpcionTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionTecladoActionPerformed(evt);
            }
        });

        TeclaRe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TeclaReMouseEntered(evt);
            }
        });
        TeclaRe.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TeclaReInputMethodTextChanged(evt);
            }
        });
        TeclaRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeclaReActionPerformed(evt);
            }
        });
        TeclaRe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TeclaReKeyPressed(evt);
            }
        });

        Gato.setText("Gato");
        Gato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Clicar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TeclaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TeclaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasarRaton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OpcionTeclado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Gato)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gato)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clicar)
                    .addComponent(PasarRaton)
                    .addComponent(OpcionTeclado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TeclaDo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeclaRe, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TeclaDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaDoActionPerformed
        if (click && !teclado) {
            try {
                // Cargamos el archivo de audio
                File audioFile = new File("src/sources/audio/do.wav"); // Asegúrate de proporcionar la ruta correcta
                File audioFileGato = new File("src/sources/audio/miauDo.wav");
                if (!audioFile.exists()) {
                    System.err.println("El archivo de audio no existe.");
                    return;
                }
                // Creamos un Clip para reproducir el audio
                Clip clip = AudioSystem.getClip();
                if (!gato){
                    clip.open(AudioSystem.getAudioInputStream(audioFile));
                } else {
                     clip.open(AudioSystem.getAudioInputStream(audioFileGato));
                }
                

                // Reproducimos el audio
                clip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            }
        }
    }//GEN-LAST:event_TeclaDoActionPerformed

    private void TeclaDoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeclaDoMouseEntered
        if (!click && !teclado) {
            try {
                // Cargamos el archivo de audio
                File audioFile = new File("src/sources/audio/do.wav"); // Asegúrate de proporcionar la ruta correcta
                if (!audioFile.exists()) {
                    System.err.println("El archivo de audio no existe.");
                    return;
                }

                // Creamos un Clip para reproducir el audio
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(audioFile));

                // Reproducimos el audio
                clip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            }
        }
    }//GEN-LAST:event_TeclaDoMouseEntered


    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.print(click + " A " + teclado);
        if (teclado) {
            char keyPressed = evt.getKeyChar();
            switch (keyPressed) {
                case 'a' -> {
                    try {
                        File audioFile = new File("src/sources/audio/do.wav");
                        if (!audioFile.exists()) {
                            System.err.println("El archivo de audio 'do' no existe.");
                            return;
                        }
                        Clip clip = AudioSystem.getClip();
                        clip.open(AudioSystem.getAudioInputStream(audioFile));
                        clip.start();
                    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
                    }
                }
                case 's' -> {
                    try {
                        File audioFile = new File("src/sources/audio/re.wav");
                        if (!audioFile.exists()) {
                            System.err.println("El archivo de audio 're' no existe.");
                            return;
                        }
                        Clip clip = AudioSystem.getClip();
                        clip.open(AudioSystem.getAudioInputStream(audioFile));
                        clip.start();
                    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
                    }
                }
                default -> {
                }
            }
            // Manejar otro caso si es necesario
        }
    }//GEN-LAST:event_formKeyPressed


    private void ClicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClicarActionPerformed
        if (Clicar.isSelected()) {
            // Si está seleccionado, establece la variable en false
            click = true;
            teclado = false;
            System.out.println(click);
            PasarRaton.setSelected(false);
            OpcionTeclado.setSelected(false);
            TeclaDo.setText("");
            TeclaRe.setText("");
        } else {
            // Si no está seleccionado, establece la variable en true
            click = false;
            System.out.println(click);
        }
    }//GEN-LAST:event_ClicarActionPerformed

    private void PasarRatonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasarRatonActionPerformed
        // TODO add your handling code here:
        if (PasarRaton.isSelected()) {
            Clicar.setSelected(false);
            OpcionTeclado.setSelected(false);
            click = false;
            teclado = false;
            TeclaDo.setText("");
            TeclaRe.setText("");
        }
    }//GEN-LAST:event_PasarRatonActionPerformed

    private void OpcionTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionTecladoActionPerformed
        // TODO add your handling code here:
        if (OpcionTeclado.isSelected()) {
            requestFocusInWindow();
            teclado = true;
            Clicar.setSelected(false);
            PasarRaton.setSelected(false);
            TeclaDo.setText("A");
            TeclaRe.setText("S");
            System.out.print(teclado + " es teclado");
        } else {
            teclado = false;
            System.out.print("El teclado está  " + teclado);
        }

    }//GEN-LAST:event_OpcionTecladoActionPerformed


    private void TeclaReMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TeclaReMouseEntered
        // TODO add your handling code here:
        if (!click && !teclado) {
            try {
                // Cargamos el archivo de audio
                File audioFile = new File("src/sources/audio/re.wav"); // Asegúrate de proporcionar la ruta correcta
                if (!audioFile.exists()) {
                    System.err.println("El archivo de audio no existe.");
                    return;
                }

                // Creamos un Clip para reproducir el audio
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(audioFile));

                // Reproducimos el audio
                clip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            }
        }
    }//GEN-LAST:event_TeclaReMouseEntered

    private void TeclaReInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TeclaReInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TeclaReInputMethodTextChanged

    private void TeclaReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeclaReActionPerformed
        // TODO add your handling code here:
        if (click && !teclado) {
            try {
                // Cargamos el archivo de audio
                File audioFile = new File("src/sources/audio/re.wav"); // Asegúrate de proporcionar la ruta correcta
                if (!audioFile.exists()) {
                    System.err.println("El archivo de audio no existe.");
                    return;
                }
                // Creamos un Clip para reproducir el audio
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(audioFile));

                // Reproducimos el audio
                clip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            }
        }
    }//GEN-LAST:event_TeclaReActionPerformed

    private void GatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GatoActionPerformed
        gato = Gato.isSelected();
    }//GEN-LAST:event_GatoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Clicar;
    private javax.swing.JRadioButton Gato;
    private javax.swing.JRadioButton OpcionTeclado;
    private javax.swing.JRadioButton PasarRaton;
    private javax.swing.JButton TeclaDo;
    private javax.swing.JButton TeclaRe;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
    private boolean click = false;
    private boolean teclado = false;
    private boolean gato = false;
}
