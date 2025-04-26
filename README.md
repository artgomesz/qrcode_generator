# 📦 Gerador de QR Codes com Java Spring, Amazon S3 e Docker

Este projeto é uma aplicação backend desenvolvida em **Java** utilizando o **Spring Boot**, com armazenamento de arquivos na **Amazon S3** e containerizada utilizando **Docker**.  
A aplicação recebe um link via requisição `POST` e gera um **QR Code** correspondente, armazenando-o no S3.

---

## 🚀 Funcionalidades

- Geração de QR Codes a partir de links enviados via API.
- Armazenamento dos QR Codes gerados em um bucket S3 da AWS.
- Containerização da aplicação com Docker.

---

## ⚙️ Como usar

### Pré-requisitos

- Conta AWS com acesso a um bucket S3.
- Docker instalado.
- Java 17+ e Maven instalados (caso queira rodar localmente sem Docker).

---

## 🔧 Configurações necessárias

1. **AWS:**
   - Crie uma conta na AWS (se ainda não tiver).
   - No console da AWS, crie um bucket S3 para armazenar os QR Codes.
   - Gere suas credenciais de acesso (**AWS Access Key** e **AWS Secret Key**).

2. **Editar o Dockerfile:**
   Antes de construir a imagem Docker, adicione suas credenciais no `Dockerfile`:

   ```dockerfile
   ARG AWS_ACCESS_KEY_ID=<sua-access-key>
   ARG AWS_SECRET_ACCESS_KEY=<sua-secret-key>
⚠️ Importante: Nunca compartilhe ou publique suas chaves da AWS em repositórios públicos!

🐳 Rodar a aplicação com Docker
Construir a imagem:

bash
Copiar
Editar
docker build -t qrcode-generator .
Rodar o container:

bash
Copiar
Editar
docker run -p 8080:8080 qrcode-generator
A aplicação ficará disponível em:
👉 http://localhost:8080

📚 Endpoints da API
➡️ Gerar QR Code
POST /qrcode

Descrição: Envia o link desejado para gerar o QR Code.

Body (JSON):

json
Copiar
Editar
{
  "text": "https://seulink.com"
}
Resposta (JSON):

json
Copiar
Editar
{
  "message": "QR Code gerado com sucesso!",
  "urlQrCode": "https://seu-bucket-s3.amazonaws.com/nome-do-qrcode.png"
}
🛠️ Tecnologias utilizadas
Java 17

Spring Boot

Amazon S3 SDK

Docker

ZXing (para geração de QR Codes)

## 📌 Considerações
Este projeto é apenas um backend. Você pode consumir a API usando ferramentas como Postman, Insomnia, ou integrá-la ao seu próprio frontend.

Certifique-se de configurar corretamente as permissões do seu bucket S3 para permitir upload e leitura dos QR Codes gerados.
