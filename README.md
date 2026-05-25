🎮 Gerenciador de Jogos - Android (Room & MVVM)
Este projeto é uma aplicação Android desenvolvida como parte da avaliação da disciplina de Desenvolvimento Android. O objetivo foi criar um aplicativo funcional que utiliza os pilares da arquitetura moderna do Android, permitindo o gerenciamento de uma lista de jogos com persistência de dados.
🚀 Tecnologias e Conceitos Utilizados
O projeto segue a arquitetura recomendada pelo Google, garantindo separação de responsabilidades e facilidade de manutenção:
•
Linguagem: Kotlin
•
Persistência de Dados: Room Database (SQLite)
•
Interface de Usuário: RecyclerView com ListAdapter e DiffUtil para atualizações eficientes.
•
Arquitetura: MVVM (Model-View-ViewModel)
•
Componentes de Arquitetura:
◦
ViewModel: Gerenciamento de estado da UI.
◦
LiveData: Observação de dados em tempo real.
◦
Repository: Mediação entre a fonte de dados (DAO) e o ViewModel.
•
Layout: ConstraintLayout para uma interface responsiva e organizada.
📋 Funcionalidades
1.
Listagem de Jogos: Exibição dinâmica de todos os jogos cadastrados no banco de dados.
2.
Cadastro de Itens: Formulário para adicionar novos jogos com Nome, Plataforma, Gênero e Descrição.
3.
Remoção de Itens: Possibilidade de excluir jogos da lista com atualização automática da interface.
4.
Persistência Offline: Os dados permanecem salvos no dispositivo mesmo após fechar o aplicativo.
🛠️ Como Rodar o Projeto
Para testar o aplicativo em sua máquina local, siga os passos abaixo:
1.
Clone o repositório:
Shell Script
git clone https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git
2.
Abra o Android Studio.
3.
Vá em File > Open e selecione a pasta do projeto clonado.
4.
Aguarde a sincronização do Gradle (pode levar alguns minutos na primeira vez).
5.
Conecte um dispositivo físico ou utilize um Emulador (API 26 ou superior).
6.
Clique no botão Run (Play) no topo do Android Studio.
📝 Estrutura de Pastas (Organização)
br.com.ulbra.jogos
├── data
│   ├── local (DAO e Database)
│   └── JogoRepository.kt
├── model
│   └── Jogo.kt (Entity)
├── ui
│   ├── JogoAdapter.kt
│   └── viewmodel
│       └── JogoViewModel.kt
└── MainActivity.kt
Desenvolvido por: [Seu Nome] 🚀
