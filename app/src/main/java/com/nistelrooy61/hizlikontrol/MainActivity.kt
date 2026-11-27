package com.nistelrooy61.hizlikontrol

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(64, 120, 64, 64)
        }

        val info = TextView(this).apply {
            text = "1. Aşağıdaki butona basıp 'İndirilen uygulamalar' içinden 'Hızlı Kontrol Servisi'ni aktif edin.\n\n2. Kontrol Merkezini aşağı çekip 'Düzenle'ye dokunun ve 'Yeniden Başlat' ile 'Ekranı Kilitle' butonlarını yukarı taşıyın."
            textSize = 16f
            setPadding(0, 0, 0, 48)
        }

        val btn = Button(this).apply {
            text = "Erişilebilirlik Ayarlarını Aç"
            setOnClickListener {
                startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
            }
        }

        layout.addView(info)
        layout.addView(btn)
        setContentView(layout)
    }
}
