package Exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EscolherOpcao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção de 1 a 20:");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção 1: Calcular Circuito");
                
                System.out.println("Digite o valor que deseja calcular: ");
    			double areaPerimetro = scanner.nextDouble();
    			Circuito circuito = new Circuito(areaPerimetro);
    			System.out.println("Raio "+ circuito.getAreaPerimetro());
    			System.out.println("Area: "+ circuito.calcularArea());
    			break;
            
            case 2:
                System.out.println("Você escolheu a opção 2. Conta Bancária.");
                
                scanner.nextLine();
                
                System.out.println("Digite o número da conta: ");
        		String conta = scanner.nextLine();
        		
        		System.out.println("Digite o nome do titular: ");
        		String nome = scanner.nextLine();
        		
        		System.out.println("Digite o saldo inicial: ");
        		double saldoInicial = scanner.nextDouble();
        		
        		ContaBancaria contaBancaria = new ContaBancaria(conta, nome, saldoInicial);
        		
        		boolean continuar = true;
        		
        		while (continuar) {
        			
        			System.out.println("\nEscolha a opção desejada:");
        			System.out.println("1- Verificar saldo");
        			System.out.println("2- Depositar");
        			System.out.println("3- Sacar");
        			System.out.println("4- Sair");
        			
        			int opcao1 = scanner.nextInt();
        			
        			switch(opcao1) {
        			case 1:
        				System.out.println("Saldo atual: R$"+ contaBancaria.verificarSaldo());
        				break;
        			case 2:
        				System.out.println("Digite o valor para depositar: R$");
        				double valorDeposito = scanner.nextDouble();
        				contaBancaria.depositar(valorDeposito);
        				break;
        				
        			case 3:
        				System.out.println("Digite o valor para sacar: R$");
        				double valorSaque = scanner.nextDouble();
        				contaBancaria.sacar(valorSaque);
        				break;
        			case 4:
        				continuar = false;
        				System.out.println("Encerrando o programa.");
        				break;
        			default:
        				System.out.println("Opção inválida. Tente Novamente.");
        			break;
        		}
        	}
               
                break;
           
            case 3:
                System.out.println("Você escolheu a opção 3. Calcular a Área do Retângulo.");
                
                System.out.println("Digite a altura do retângulo: ");
        		double altura = scanner.nextDouble();
        		
        		System.out.println("Digite a largura do retângulo: ");
        		double largura = scanner.nextDouble();
        		
        		Retangulo retangulo = new Retangulo(altura, largura);
        		
        		System.out.println("Área do retângulo: "+ retangulo.calcularArea());
        		System.out.println("Perímetro do retângulo: "+ retangulo.calcularPerimetro());
        		
                break;
            
            case 4:
                System.out.println("Você escolheu a opção 4. Média do Aluno.");
                scanner.nextLine();
                System.out.println("Digite o nome do aluno: ");
                String nomeAluno = scanner.nextLine();
                
                System.out.println("Digite a matrícula do aluno: ");
                String matricula = scanner.nextLine();
                
                System.out.println("Quantas notas o aluno possui? ");
                int quantidadeNotas = scanner.nextInt();
                
                double[] notas = new double[quantidadeNotas];
                for(int i = 0; i < quantidadeNotas; i++) {
                	System.out.println("Digite a nota "+ (i+1)+ ": ");
                	notas[i] = scanner.nextDouble();
                }
                Aluno aluno = new Aluno(nomeAluno, matricula, notas);
                aluno.exibirInformacoes();
                
                break;
           
            case 5:
                System.out.println("Você escolheu a opção 5. Funcionário.");
                
                scanner.nextLine();
                
                System.out.println("Digite o nome do funcionário: ");
                String nomeFuncionario = scanner.nextLine();
                
                System.out.println("Digite o salário bruto: R$ ");
                double salarioBruto = scanner.nextDouble();
                
                System.out.println("Digite o cargo: ");
                scanner.nextLine();
                String cargo = scanner.nextLine();
                
                System.out.println("Digite o percentual de imposto (EXEMPLO: 15 para 15%): ");
                double imposto = scanner.nextDouble();
                
                System.out.println("Digite o valor dos benefícios: R$ ");
                double beneficios = scanner.nextDouble();

                Funcionario funcionario = new Funcionario(nomeFuncionario, salarioBruto, cargo, imposto, beneficios);
                funcionario.exibirDados();
                
             
                break;
          
            case 6:
                System.out.println("Você escolheu a opção 6. Produto.");
                
                scanner.nextLine();
                
                System.out.print("Digite o nome do produto: ");
                String nomeProduto = scanner.nextLine();

                System.out.print("Digite o preço do produto: R$ ");
                double preco = scanner.nextDouble();

                System.out.print("Digite a quantidade em estoque: ");
                int qtde = scanner.nextInt();

                Produto produto = new Produto(nomeProduto, preco, qtde);
                
                produto.exibirDados();
            
                break;
          
            case 7:
                System.out.println("Você escolheu a opção 7. Calcular Triângulo.");
         
                scanner.nextLine();
                
                System.out.print("Digite o valor do lado 1: ");
                double lado1 = scanner.nextDouble();

                System.out.print("Digite o valor do lado 2: ");
                double lado2 = scanner.nextDouble();

                System.out.print("Digite o valor do lado 3: ");
                double lado3 = scanner.nextDouble();

                Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

                triangulo.exibirDados();
                
                break;
         
            case 8:
                System.out.println("Você escolheu a opção 8. Velocidade do Carro.");
          
                scanner.nextLine()
;
                System.out.print("Digite a marca do carro: ");
                String marca = scanner.nextLine();

                System.out.print("Digite o modelo do carro: ");
                String modelo = scanner.nextLine();

			int velocidadeAtual = 0;
			Carro carro = new Carro(marca, modelo, velocidadeAtual);
                
                carro.exibirDados();
                
                boolean continuar1 = true;
                
                while (continuar1) {
                    System.out.println("\nEscolha uma ação:");
                    System.out.println("1. Acelerar");
                    System.out.println("2. Frear");
                    System.out.println("3. Exibir velocidade atual");
                    System.out.println("4. Sair");

                    int escolha = scanner.nextInt();

                    switch (escolha) {
                        case 1:
                            System.out.print("Digite o valor para acelerar (km/h): ");
                            double acelerarValor = scanner.nextDouble();
                            carro.acelerar(acelerarValor);
                            break;
                        case 2:
                            System.out.print("Digite o valor para frear (km/h): ");
                            double frearValor = scanner.nextDouble();
                            carro.frear(frearValor);
                            break;
                        case 3:
                            carro.exibirVelocidadeAtual();
                            break;
                        case 4:
                            continuar1 = false;
                            System.out.println("Encerrando o programa.");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
                break;
           
            case 9:
                System.out.println("Você escolheu a opção 9. Paciente.");
                scanner.nextLine();
                
                       System.out.print("Digite o nome do paciente: ");
                       String nome1 = scanner.nextLine();

                        System.out.print("Digite a idade do paciente: ");
                        int idade = scanner.nextInt();
                        
                        scanner.nextLine();
                        
                        Paciente paciente = new Paciente(nome1, idade);

                        int opcao1 = 0;
                        do {
                            System.out.println("\nMenu:");
                            System.out.println("1. Adicionar nova consulta");
                            System.out.println("2. Exibir histórico de consultas");
                            System.out.println("3. Exibir dados do paciente");
                            System.out.println("0. Sair");
                            System.out.print("Escolha uma opção: ");
                            opcao1 = scanner.nextInt();
                            scanner.nextLine();

                            switch (opcao1) {
                                case 1:
                                    System.out.print("Digite a descrição da consulta: ");
                                    String consulta = scanner.nextLine();
                                    paciente.adicionarConsulta(consulta);
                                    break;
                                case 2:
                                    paciente.exibirConsultas();
                                    break;
                                case 3:
                                    paciente.exibirDados();
                                    break;
                                case 0:
                                    System.out.println("Encerrando o sistema...");
                                    break;
                                default:
                                    System.out.println("Opção inválida. Tente novamente.");
                            }
                        } while (opcao1 != 0);

                        scanner.close();
                    
                break;
        
            case 10:
                System.out.println("Você escolheu a opção 10.");
                
                scanner.nextLine();
                
                System.out.print("Digite o título do livro: ");
                String titulo = scanner.nextLine();

                System.out.print("Digite o autor do livro: ");
                String autor = scanner.nextLine();

                System.out.print("Digite o número de páginas do livro: ");
                int numeroPaginas = scanner.nextInt();
                scanner.nextLine();
                
                Livro livro = new Livro(titulo, autor, numeroPaginas);

                int opcao11 = 0;
                do {
                    System.out.println("\nMenu:");
                    System.out.println("1. Emprestar o livro");
                    System.out.println("2. Devolver o livro");
                    System.out.println("3. Verificar disponibilidade");
                    System.out.println("4. Exibir informações do livro");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao11 = scanner.nextInt();
                    
                    scanner.nextLine();

                    switch (opcao11) {
                        case 1:
                            livro.emprestar();
                            break;
                        case 2:
                            livro.devolver();
                            break;
                        case 3:
                            livro.verificarDisponibilidade();
                            break;
                        case 4:
                            livro.exibirInformacoes();
                            break;
                        case 0:
                            System.out.println("Encerrando o sistema...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } while (opcao11 != 0);

                scanner.close();
            
                break;
      
            case 11:
                System.out.println("Você escolheu a opção 11. Pessoa.");
                scanner.nextLine();
                
                System.out.print("Digite o nome: ");
                String nomePessoa = scanner.nextLine();

                System.out.print("Digite a idade: ");
                int idade1 = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Digite a profissão: ");
                String profissao = scanner.nextLine();

               Pessoa pessoa = new Pessoa(nomePessoa, idade1, profissao);
                pessoa.exibirInformacoes();

                scanner.close();
            
                break;
      
            case 12:
                System.out.println("Você escolheu a opção 12. Banco.");
     
                scanner.nextLine();
                Banco banco = new Banco();
                int opcao111;

                do {
                    System.out.println("\n----- Menu do Banco -----");
                    System.out.println("1. Cadastrar Cliente");
                    System.out.println("2. Abrir Conta");
                    System.out.println("3. Depositar");
                    System.out.println("4. Sacar");
                    System.out.println("5. Transferir");
                    System.out.println("6. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao111 = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao111) {
                        case 1:
                            System.out.print("Digite o nome do cliente: ");
                            String nomeCliente = scanner.nextLine();
                            System.out.print("Digite o CPF do cliente: ");
                            String cpf = scanner.nextLine();
                            banco.cadastrarCliente(nomeCliente, cpf);
                            break;

                        case 2:
                            System.out.print("Digite o CPF do cliente para abrir uma conta: ");
                            cpf = scanner.nextLine();
                            banco.abrirConta(cpf);
                            break;

                        case 3:
                            System.out.print("Digite o CPF da conta para depósito: ");
                            cpf = scanner.nextLine();
                            Conta conta1 = banco.buscarContaPorCpf(cpf);
                            if (conta1 != null) {
                                System.out.print("Digite o valor para depósito: ");
                                double valorDeposito = scanner.nextDouble();
                                conta1.depositar(valorDeposito);
                            } else {
                                System.out.println("Conta não encontrada.");
                            }
                            break;

                        case 4:
                            System.out.print("Digite o CPF da conta para saque: ");
                            cpf = scanner.nextLine();
                            conta1 = banco.buscarContaPorCpf(cpf);
                            if (conta1 != null) {
                                System.out.print("Digite o valor para saque: ");
                                double valorSaque = scanner.nextDouble();
                                conta1.sacar(valorSaque);
                            } else {
                                System.out.println("Conta não encontrada.");
                            }
                            break;

                        case 5:
                            System.out.print("Digite o CPF da conta de origem: ");
                            String cpfOrigem = scanner.nextLine();
                            Conta contaOrigem = banco.buscarContaPorCpf(cpfOrigem);
                            if (contaOrigem != null) {
                                System.out.print("Digite o CPF da conta de destino: ");
                                String cpfDestino = scanner.nextLine();
                                Conta contaDestino = banco.buscarContaPorCpf(cpfDestino);
                                if (contaDestino != null) {
                                    System.out.print("Digite o valor para transferência: ");
                                    double valorTransferencia = scanner.nextDouble();
                                    contaOrigem.transferir(contaDestino, valorTransferencia);
                                } else {
                                    System.out.println("Conta de destino não encontrada.");
                                }
                            } else {
                                System.out.println("Conta de origem não encontrada.");
                            }
                            break;

                        case 6:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao111 != 6);

                scanner.close();
            
                break;
       
            case 13:
                System.out.println("Você escolheu a opção 13. Loja virtual.");
       
                LojaVirtual loja = new LojaVirtual();
                CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
                Scanner scanner1 = new Scanner(System.in);
                int opacao3;

                do {
                    System.out.println("\n----- Menu da Loja Virtual -----");
                    System.out.println("1. Cadastrar Produto");
                    System.out.println("2. Adicionar Produto ao Carrinho");
                    System.out.println("3. Aplicar Desconto");
                    System.out.println("4. Exibir Carrinho");
                    System.out.println("5. Finalizar Compra");
                    System.out.println("6. Sair");
                    System.out.print("Escolha uma opção: ");
                    opacao3 = scanner1.nextInt();
                    scanner1.nextLine();

                    switch (opacao3) {
                        case 1:
                            System.out.print("Digite o nome do produto: ");
                            String nomeProduto1 = scanner1.nextLine();
                            System.out.print("Digite o preço do produto: ");
                            double preco1 = scanner1.nextDouble();
                            loja.cadastrarProduto(nomeProduto1, preco1);
                            break;

                        case 2:
                            System.out.print("Digite o nome do produto a ser adicionado ao carrinho: ");
                            nomeProduto1 = scanner1.nextLine();
                            ProdutoLoja produto1 = loja.buscarProduto(nomeProduto1);
                            if (produto1 != null) {
                                carrinho.adicionarProduto(produto1);
                            } else {
                                System.out.println("Produto não encontrado.");
                            }
                            break;

                        case 3:
                            System.out.print("Digite o percentual de desconto a ser aplicado: ");
                            double desconto = scanner1.nextDouble();
                            carrinho.aplicarDesconto(desconto);
                            break;

                        case 4:
                            carrinho.exibirCarrinho();
                            break;

                        case 5:
                            System.out.println("Finalizando compra...");
                            System.out.println("Valor total a pagar: R$ " + carrinho.calcularTotal());
                            break;

                        case 6:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opacao3 != 6);

                scanner1.close();
                break;
       
            case 14:
                System.out.println("Você escolheu a opção 14. Agenda.");
                
                Agenda agenda = new Agenda();
                Scanner scanner2 = new Scanner(System.in);
                int opaca4;

                do {
                    System.out.println("\n--- Menu da Agenda ---");
                    System.out.println("1. Adicionar Contato");
                    System.out.println("2. Editar Contato");
                    System.out.println("3. Remover Contato");
                    System.out.println("4. Buscar Contato por Nome");
                    System.out.println("5. Buscar Contato por Telefone");
                    System.out.println("6. Exibir Todos os Contatos");
                    System.out.println("7. Sair");
                    System.out.print("Escolha uma opção: ");
                    opaca4 = scanner2.nextInt();
                    scanner2.nextLine(); 

                    switch (opaca4) {
                        case 1:
                            System.out.print("Digite o nome do contato: ");
                            String nomeContato = scanner2.nextLine();
                            System.out.print("Digite o telefone do contato: ");
                            String telefone = scanner2.nextLine();
                            agenda.adicionarContato(nomeContato, telefone);
                            break;

                        case 2:
                            System.out.print("Digite o nome do contato a ser editado: ");
                            String nomeAntigo = scanner2.nextLine();
                            System.out.print("Digite o novo nome: ");
                            String novoNome = scanner2.nextLine();
                            System.out.print("Digite o novo telefone: ");
                            String novoTelefone = scanner2.nextLine();
                            agenda.editarContato(nomeAntigo, novoNome, novoTelefone);
                            break;

                        case 3:
                            System.out.print("Digite o nome do contato a ser removido: ");
                            nomeContato = scanner2.nextLine();
                            agenda.removerContato(nomeContato);
                            break;

                        case 4:
                            System.out.print("Digite o nome do contato a ser buscado: ");
                            nomeContato = scanner2.nextLine();
                            Contato contatoPorNome = agenda.buscarContatoPorNome(nomeContato);
                            if (contatoPorNome != null) {
                                System.out.println(contatoPorNome);
                            } else {
                                System.out.println("Contato não encontrado.");
                            }
                            break;

                        case 5:
                            System.out.print("Digite o telefone do contato a ser buscado: ");
                            telefone = scanner2.nextLine();
                            Contato contatoPorTelefone = agenda.buscarContatoPorTelefone(telefone);
                            if (contatoPorTelefone != null) {
                                System.out.println(contatoPorTelefone);
                            } else {
                                System.out.println("Contato não encontrado.");
                            }
                            break;

                        case 6:
                            agenda.exibirContatos();
                            break;

                        case 7:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opaca4 != 7);

                scanner2.close();
                break;
       
            case 15:
                System.out.println("Você escolheu a opção 15. Máquina de Vendas.");
      
                MaquinaDeVendas maquina = new MaquinaDeVendas();
                Scanner scanner3 = new Scanner(System.in);
                int opcao4;

                do {
                    System.out.println("\n--- Menu da Máquina de Vendas ---");
                    System.out.println("1. Cadastrar Produto");
                    System.out.println("2. Exibir Estoque");
                    System.out.println("3. Inserir Dinheiro");
                    System.out.println("4. Comprar Produto");
                    System.out.println("5. Retornar Troco");
                    System.out.println("6. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao4 = scanner3.nextInt();
                    scanner3.nextLine(); 

                    switch (opcao4) {
                        case 1:
                            System.out.print("Digite o nome do produto: ");
                            String nomeProduto2 = scanner3.nextLine();
                            System.out.print("Digite o preço do produto: ");
                            double preco2 = scanner3.nextDouble();
                            System.out.print("Digite a quantidade do produto: ");
                            int quantidade = scanner3.nextInt();
                            maquina.cadastrarProduto(nomeProduto2, preco2, quantidade);
                            break;

                        case 2:
                            maquina.exibirEstoque();
                            break;

                        case 3:
                            System.out.print("Digite o valor a ser inserido: ");
                            double valor = scanner3.nextDouble();
                            maquina.inserirDinheiro(valor);
                            break;

                        case 4:
                            System.out.print("Digite o nome do produto que deseja comprar: ");
                            String nomeCompra = scanner3.nextLine();
                            maquina.comprarProduto(nomeCompra);
                            break;

                        case 5:
                            maquina.retornarTroco();
                            break;

                        case 6:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao4 != 6);

                scanner3.close();
                break;
       
            case 16:
                System.out.println("Você escolheu a opção 16. Jogo de Cartas.");
       
                JogoCartas jogo = new JogoCartas();
                Scanner scanner4 = new Scanner(System.in);
                jogo.embaralharCartas();

                System.out.print("Digite o número de jogadores: ");
                int numeroJogadores = scanner4.nextInt();
                scanner4.nextLine();

                for (int i = 1; i <= numeroJogadores; i++) {
                    System.out.print("Digite o nome do jogador " + i + ": ");
                    String nomeJogador = scanner4.nextLine();
                    jogo.adicionarJogador(nomeJogador);
                }

                jogo.distribuirCartas(7);
                jogo.iniciarRodada();

                boolean jogoAtivo = true;
                while (jogoAtivo) {
                    for (Jogador jogador : jogo.jogadores) {
                        System.out.println("\nVez de " + jogador.getNome());
                        jogo.mostrarCartasJogador(jogador);

                        System.out.print("Digite o número da carta para jogar (ou -1 para passar): ");
                        int escolha = scanner4.nextInt();
                        scanner4.nextLine(); 

                        if (escolha == -1) {
                            System.out.println(jogador.getNome() + " passou a vez.");
                        } else if (escolha >= 0 && escolha < jogador.getMao().size()) {
                            Carta cartaEscolhida = jogador.getMao().get(escolha);
                            jogo.jogarCarta(jogador, cartaEscolhida);
                        } else {
                            System.out.println("Escolha inválida.");
                        }

                        if (jogador.getMao().isEmpty()) {
                            System.out.println(jogador.getNome() + " venceu o jogo!");
                            jogoAtivo = false;
                            break;
                        }
                    }
                }

                scanner4.close();
                break;
        
            case 17:
                System.out.println("Você escolheu a opção 17. Rede Social.");
    
                RedeSocial redeSocial = new RedeSocial();
                Scanner scanner5 = new Scanner(System.in);
                int opcao5;

                do {
                    System.out.println("\n--- Menu da Rede Social ---");
                    System.out.println("1. Cadastrar Usuário");
                    System.out.println("2. Adicionar Amigo");
                    System.out.println("3. Publicar Post");
                    System.out.println("4. Comentar em Post");
                    System.out.println("5. Exibir Amigos");
                    System.out.println("6. Exibir Posts");
                    System.out.println("7. Buscar Usuário");
                    System.out.println("8. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao5 = scanner5.nextInt();
                    scanner5.nextLine(); 

                    switch (opcao5) {
                        case 1:
                            System.out.print("Digite o nome do novo usuário: ");
                            String nomeUsuario = scanner5.nextLine();
                            redeSocial.adicionarUsuario(nomeUsuario);
                            break;

                        case 2:
                            System.out.print("Digite seu nome: ");
                            String seuNome = scanner5.nextLine();
                            Usuario usuario = redeSocial.buscarUsuario(seuNome);
                            if (usuario != null) {
                                System.out.print("Digite o nome do amigo a ser adicionado: ");
                                String nomeAmigo = scanner5.nextLine();
                                Usuario amigo = redeSocial.buscarUsuario(nomeAmigo);
                                if (amigo != null) {
                                    usuario.adicionarAmigo(amigo);
                                }
                            }
                            break;

                        case 3:
                            System.out.print("Digite seu nome: ");
                            String nomePostAutor = scanner5.nextLine();
                            Usuario autor1 = redeSocial.buscarUsuario(nomePostAutor);
                            if (autor1 != null) {
                                System.out.print("Digite sua mensagem: ");
                                String mensagem = scanner5.nextLine();
                                autor1.publicarPost(mensagem);
                            }
                            break;

                        case 4:
                            System.out.print("Digite seu nome: ");
                            String nomeComentarista = scanner5.nextLine();
                            Usuario comentarista = redeSocial.buscarUsuario(nomeComentarista);
                            if (comentarista != null) {
                                System.out.print("Digite o nome do usuário do post: ");
                                String nomeDoPost = scanner5.nextLine();
                                Usuario donoDoPost = redeSocial.buscarUsuario(nomeDoPost);
                                if (donoDoPost != null) {
                                    donoDoPost.exibirPosts();
                                    System.out.print("Digite o número do post para comentar (1, 2, etc.): ");
                                    int indicePost = scanner5.nextInt() - 1;
                                    scanner5.nextLine(); 
                                    if (indicePost >= 0 && indicePost < donoDoPost.getPosts().size()) {
                                        Post post = donoDoPost.getPosts().get(indicePost);
                                        System.out.print("Digite seu comentário: ");
                                        String comentario = scanner5.nextLine();
                                        comentarista.comentarPost(post, comentario);
                                    } else {
                                        System.out.println("Post inválido.");
                                    }
                                }
                            }
                            break;

                        case 5:
                            System.out.print("Digite seu nome: ");
                            String nomeAmigos = scanner5.nextLine();
                            Usuario usuarioAmigos = redeSocial.buscarUsuario(nomeAmigos);
                            if (usuarioAmigos != null) {
                                usuarioAmigos.exibirAmigos();
                            }
                            break;

                        case 6:
                            System.out.print("Digite seu nome: ");
                            String nomePosts = scanner5.nextLine();
                            Usuario usuarioPosts = redeSocial.buscarUsuario(nomePosts);
                            if (usuarioPosts != null) {
                                usuarioPosts.exibirPosts();
                            }
                            break;

                        case 7:
                            System.out.print("Digite o nome do usuário para buscar: ");
                            String nomeBusca = scanner5.nextLine();
                            Usuario encontrado = redeSocial.buscarUsuario(nomeBusca);
                            if (encontrado != null) {
                                System.out.println("Usuário " + encontrado.getNome() + " encontrado.");
                            }
                            break;

                        case 8:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao5 != 8);

                scanner5.close();
                break;
   
            case 18:
                System.out.println("Você escolheu a opção 18. Biblioteca.");
  
                Biblioteca biblioteca = new Biblioteca();
                Scanner scanner6 = new Scanner(System.in);
                int opcao6;

                do {
                    System.out.println("\n--- Menu da Biblioteca ---");
                    System.out.println("1. Cadastrar Livro");
                    System.out.println("2. Emprestar Livro");
                    System.out.println("3. Devolver Livro");
                    System.out.println("4. Verificar Disponibilidade");
                    System.out.println("5. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao6 = scanner6.nextInt();
                    scanner6.nextLine(); 

                    switch (opcao6) {
                        case 1:
                            System.out.print("Digite o título do livro: ");
                            String titulo2 = scanner6.nextLine();
                            System.out.print("Digite o autor do livro: ");
                            String autor2 = scanner6.nextLine();
                            biblioteca.cadastrarLivro(titulo2, autor2);
                            break;

                        case 2:
                            System.out.print("Digite o título do livro a ser emprestado: ");
                            String tituloEmprestimo = scanner6.nextLine();
                            biblioteca.emprestarLivro(tituloEmprestimo);
                            break;

                        case 3:
                            System.out.print("Digite o título do livro a ser devolvido: ");
                            String tituloDevolucao = scanner6.nextLine();
                            biblioteca.devolverLivro(tituloDevolucao);
                            break;

                        case 4:
                            System.out.print("Digite o título do livro para verificar a disponibilidade: ");
                            String tituloVerificacao = scanner6.nextLine();
                            biblioteca.verificarDisponibilidade(tituloVerificacao);
                            break;

                        case 5:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao6 != 5);

                scanner6.close();
                break;
   
            case 19:
                System.out.println("Você escolheu a opção 19. Calendário.");
   
                Calendario calendario = new Calendario();
                Scanner scanner7 = new Scanner(System.in);

                int opcao7;
                do {
                    System.out.println("\n--- Menu do Calendário ---");
                    System.out.println("1. Exibir Calendário de um Mês");
                    System.out.println("2. Verificar se uma Data é Feriado");
                    System.out.println("3. Adicionar um Feriado");
                    System.out.println("4. Calcular Diferença entre Duas Datas");
                    System.out.println("5. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao7 = scanner7.nextInt();

                    switch (opcao7) {
                        case 1:
                            System.out.print("Digite o mês (1-12): ");
                            int mes = scanner7.nextInt();
                            System.out.print("Digite o ano: ");
                            int ano = scanner7.nextInt();
                            calendario.exibirCalendario(mes, ano);
                            break;

                        case 2:
                            System.out.print("Digite o dia: ");
                            int diaFeriado = scanner7.nextInt();
                            System.out.print("Digite o mês (1-12): ");
                            int mesFeriado = scanner7.nextInt();
                            if (calendario.verificarFeriado(diaFeriado, mesFeriado)) {
                                System.out.println("Essa data é um feriado.");
                            } else {
                                System.out.println("Essa data não é um feriado.");
                            }
                            break;

                        case 3:
                            System.out.print("Digite o dia do feriado: ");
                            int diaNovoFeriado = scanner7.nextInt();
                            System.out.print("Digite o mês do feriado (1-12): ");
                            int mesNovoFeriado = scanner7.nextInt();
                            calendario.adicionarFeriado(diaNovoFeriado, mesNovoFeriado);
                            break;

                        case 4:
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                            System.out.print("Digite a primeira data (dd/MM/yyyy): ");
                            scanner7.nextLine(); 
                            String data1Str = scanner7.nextLine();
                            LocalDate data1 = LocalDate.parse(data1Str, formatter);

                            System.out.print("Digite a segunda data (dd/MM/yyyy): ");
                            String data2Str = scanner7.nextLine();
                            LocalDate data2 = LocalDate.parse(data2Str, formatter);

                            long diferenca = calendario.diferencaEntreDatas(data1, data2);
                            System.out.println("Diferença entre as datas: " + diferenca + " dias.");
                            break;

                        case 5:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }

                } while (opcao7 != 5);

                scanner7.close();
                break;
    
            case 20:
                System.out.println("Você escolheu a opção 20. Jogo de advinhação.");
   
                Scanner scanner8 = new Scanner(System.in);
                JogoAdivinhacao jogo1 = new JogoAdivinhacao();

                System.out.println("Bem-vindo ao Jogo de Adivinhação!");
                System.out.println("Tente adivinhar o número entre 1 e 100.");

                boolean acertou = false;

                while (!acertou) {
                    System.out.print("Digite o seu palpite: ");
                    int palpite = scanner8.nextInt();

                    jogo1.fazerPalpite(palpite);
                    acertou = jogo1.acertou(palpite);
                }

                scanner8.close();
                break;
   
            default:
                System.out.println("Opção inválida! Escolha um número entre 1 e 20.");
    
                break;
        }while (opcao < 1 || opcao > 20);

        System.out.println("Programa finalizado.");
        scanner.close();

        scanner.close();
    }
}
