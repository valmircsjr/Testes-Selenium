# 1 Testes Selenium
Atividade visa escolher um Sistema Web para usarmos como base para testes no selenium Web Driver, utilizando o Padrão Page Object.

# 2 Plano do Projeto
## 2.1 Sistema
Escolhemos como base para nossos testes o **SIGOc** (Sistema de Gerenciamento de Ocorrências), que é um projeto do Smart Metropolis que visa auxiliar e sofisticar o gerenciamento de ocorrências e vigilantes nos campi da UFRN.

O **SIGOc** é composto por um aplicativo para a comunidade universitária, um aplicativo para uso dos Vigilantes em serviço e um dashboard web direcionado aos supervisores que lidam com o gerenciamento cotidiano dos recursos.

## 2.2 Escopo dos testes
Os testes contemplam as seguintes funcionalidades:

* Cadastro de ocorrência;
* Finalizar ocorrência;
* Cancelar ocorrência;
* Exibição de status.
* Atribuição de vigilantes;

## 2.3 Critérios de Testes
Os critérios de testes definidos para esse sistema são:

* **Baseados em casos de uso:** Através da análise dos casos de uso, vamos examinar os fluxos e gerar cenários para que os casos de teste sejam gerados;
* **Valor limite:** Será associado aos casos de testes gerados na primeira etapa, deixando a suíte de testes mais robusta.

---

As seções seguintes descrevem o processo de geração dos valores para testes do projeto em questão.

---

# 3 Casos de Uso Dashboard SINFO Orion

## 3.1 USECASE#1: Atribuição de Vigilantes:

### 3.1.1 Fluxo Básico:

1. Seleciona uma ocorrência;
2. Aciona a opção Despachar Vigilantes;
3. Seleciona um vigilante da lista lateral para ser despachado;
4. Clica em Terminar Despacho;
5. Vigilante fica indisponível para atendimento de ocorrências até que seja liberado da ocorrência atribuída.

### 3.1.2 Fluxos Alternativos:

1. Na Etapa 3, o Supervisor poderá clicar em "Terminar Despacho" sem escolher nenhum vigilante;

2. Na Etapa 3, um erro será retornado caso haja tentativa de despachar mais de um Vigilante.

---

## 3.2 USECASE#2: Cadastro de Ocorrência:

### 3.2.1 Fluxo Básico:

1. Clica no botão "Cadastrar Nova ocorrência";
2. Insere os dados da ocorrência;
3. Clica no botão "Cadastrar Nova ocorrência" ao fim do formulário;
4. Uma nova ocorrência é criada no Dashboard;

### 3.2.2 Fluxos Alternativos:

1. Na Etapa 3, caso um campo seja inválido, uma mensagem de erro correspondente deve ser retornada.
2. Em qualquer etapa a partir da Etapa 2, pode-se cancelar o cadastro apertando no botão de Cancelar

---

## 3.3 USECASE#3: Finalizar/Cancelar Ocorrência:

1. Seleciona uma ocorrência;
2. Clica em Finalizar/Cancelar ocorrência;
3. Ocorrência assume seu respectivo estado (Finalizada ou Cancelada);

---

## 3.4 USECASE#4: Exibição de Status

1. Abre sidebar;
2. Seleciona uma categoria clicando no switch superior da sidebar (Vigilantes ou Ocorrências);
3. Seleciona um status dentre os disponíveis;


# 4 Geração dos Cenários 

## 4.1 Cenários do USECASE#1 (Atribuição de Vigilantes):

1. Despacho bem sucedido: Fluxo Básico
2. Despacho Cancelado: Fluxo Básico > Fluxo Alt 1
3. Tentativa de despacho múltiplo: Fluxo Básico > Fluxo Alt 2

## 4.2 Cenários do USECASE#2 (Cadastro de Ocorrência):

1. Cadastro bem sucedido: Fluxo Básico
2. Cadastro Inválido: Fluxo Básico > Alt 1
3. Cadastro Cancelado: Fluxo Básico > Alt 2

## 4.3 Cenários do USECASE#3 (Finalizar/Cancelar Ocorrência):

1. Finalização/Cancelamento bem sucedido: Fluxo Básico

## 4.4 Cenários do USECASE#4 (Exibição de Status):

1. Status Exibido: Fluxo Básico

# 5 Geração dos Casos/Valores de Teste

De todos os casos de uso, apenas dois campos possuem valores que não são booleanos. Poranto, devido à natureza da aplicação, as duas etapas de geração dos casos de teste e da matriz de valores serão agrupadas numa única etapa. Nestes campos citados, os valores limite serão aplicados de forma a gerar valores mais robustos para testes.

## 5.1 Casos de teste para USECASE#1

| Test Case ID | Cenário | Vig Despac #1  | Vig Despac #2  | Despacho Cancelado | Resultado |
| ------------ | ------- | -------------- | -------------- | ------------------ | --------- |
| 1            | 1       | Despachado     | Não despachado | FALSE              | Sucesso   |
| 2            | 2       | Despachado     | Despachado     | FALSE              | Erro      |
| 3            | 3       | Não despachado | Não despachado | TRUE               | Término   |

## 5.2 Casos de teste para USECASE#2

| Test Case ID | Cenário | Dados Inválidos      | Despacho Cancelado | Resultado         |
| ------------ | ------- | -------------------- | ------------------ | ----------------- |
| 4            | 1       | FALSE                | FALSE              | Sucesso           |
| 5            | 2       | Formato Inválido     | FALSE              | Erro de Validação |
| 6            | 2       | ""                   | FALSE              | Erro de Validação |
| 7            | 2       | STR_MAX_LENGTH       | FALSE              | Sucesso           |
| 8            | 2       | STR_MAX_LENGTH + 1   | FALSE              | Exceção Lançada   |
| 9            | 3       | Indiferente          | TRUE               | Término           |

Nos casos de 5 a 8, o campo a conter o valor inválido pode ser escolhido arbitrariamente.

## 5.3 Casos de Teste para USECASE#3

| Test Case ID | Cenário | Finalização | Cancelamento | Resultado             |
| ------------ | ------- | ----------- | ------------ | --------------------- |
| 10           | 1       | TRUE        | Indiferente  | Ocorrência Finalizada |
| 11           | 1       | Indiferente | TRUE         | Ocorrência Cancelada  |

## 5.4 Casos de Teste para USECASE#4

| Test Case ID | Cenário | Botão Pressionado | Resultado      |
| ------------ | ------- | ----------------- | -------------- |
| 12           | 1       | TRUE              | Status exibido |
