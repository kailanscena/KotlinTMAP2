## 🐛 Erro: `cmd: Can't find service: package`

Este erro ocorre quando o Android Studio tenta instalar o APK no dispositivo/emulador mas falha.

---

## 🔍 Causas e Soluções

### 1. Emulador não terminou de iniciar
Aguarde o emulador carregar completamente (tela inicial visível) antes de rodar o app.  
Não clique em **Run** enquanto o emulador ainda está iniciando.

---

### 2. ADB dessincronizado — reinicie ele
Abra o Terminal no Android Studio e rode:

```bash
adb kill-server
adb start-server
```

Depois tente rodar o app novamente.

---

### 3. Boot frio no emulador
- No **AVD Manager**, clique na seta ao lado do seu emulador
- Selecione **Cold Boot Now**
- Aguarde carregar completamente e rode novamente

---

### 4. Limpar dados do emulador
- **
