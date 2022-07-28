# __Barbearia_Fase2__
Na etapa final do trabalho, o banco de dados relacional foi substituído por um banco de dados shared-nothing (chave-valor). O banco de dados NoSQL escolhido para a execução do trabalho foi o Redis. A seguir são apresentadas as instruções para a compilação e execução da aplicação.

### __1. Observações Iniciais__
  -- O repositório remoto possui dois diretórios, um para cada fase do trabalho, respectivamente. Optou-se por desenvolver as aplicações com a IDE Netbeans. Foi utilizado o sistema operacional windows, por uma questão de conveniência e maior familiaridade do aluno com o respectivo SO. 

### __2. Instalação de Softwares__

#### No windows:
  -- O Redis foi utilizado no windows 10, por meio do recurso WSL (Windows Subsystem for Linux). Passo a passo da execução: https://redis.com/blog/redis-on-windows-10/#redis10
  
#### Documentação do Redis: https://redis.io/docs/
  
### __3. Configuração da aplicação na IDE JAVA__
  
  -- Configure a classe __Principal__ de forma que a mesma seja executada quando o projeto for rodado;
  
  -- Para a correta compilação da aplicação forma instaladas duas bibliotecas adicionais, a gson-2.9.0 e a jedis-2.5.2. As mesmas podem ser encontradas nos seguintes repositórios:
  
  https://mvnrepository.com/artifact/com.google.code.gson/gson
  
  https://mvnrepository.com/artifact/redis.clients/jedis
    
  ### __3. Implementação da Aplicação__
  
  3.1) Abra o terminal e execute o servidor Redis por meio do comando -> redis-server;
  
  3.2) Abra um segundo terminal e execute a aplicação cliente do Redis por meio do comando -> redis-cli;
  
  3.3) Abra a aplicação na IDE JAVA;
  
  3.4) Faça os testes desejados por meio da execução da aplicação.
