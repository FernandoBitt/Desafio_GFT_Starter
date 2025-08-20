# 🔒 Cofre Sonoro

Um simples simulador de **cofre digital com senha sonora** desenvolvido em **Java**.  
O cofre só é aberto quando o usuário digita a sequência correta de **4 notas musicais** na ordem certa.

---

## 📜 Funcionalidades

- O programa solicita ao usuário que insira **4 notas musicais** separadas por espaço.
- A senha correta está **pré-definida** como:


- O usuário possui até **3 tentativas** para acertar a sequência.
- Respostas possíveis:
  - ✅ `"Cofre aberto com sucesso!"` → quando a sequência estiver correta.
  - ⚠️ `"Sequência incorreta."` → quando errar a sequência.
  - ⛔ `"Número máximo de tentativas excedido. Cofre permanece trancado."` → após 3 erros.

---

## 🖥️ Exemplo de uso

```bash
Bem-vindo ao Cofre Sonoro!
Digite 4 notas separadas por espaço, sem acento (ex: DO RE MI FA):

Tentativa 1 de 3:
> DO RE MI FA
Cofre aberto com sucesso!
