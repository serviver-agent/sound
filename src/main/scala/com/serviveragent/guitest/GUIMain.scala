package com.serviveragent.guitest

import java.awt.event.{WindowAdapter, WindowEvent}
import javax.swing.*

class GUIMain private (onClose: () => Unit) extends Runnable {

  override def run(): Unit = {
    val f = new JFrame("Audio Spectrum")
    f.setSize(1024, 768)
    f.setLocation(200, 200)
    f.addWindowListener(new WindowAdapter() {
      override def windowClosing(e: WindowEvent): Unit = onClose()
    })
    f.setVisible(true)
  }

}

object GUIMain {

  def start(onClose: () => Unit): Unit = {
    SwingUtilities.invokeLater(new GUIMain(onClose))
  }

}