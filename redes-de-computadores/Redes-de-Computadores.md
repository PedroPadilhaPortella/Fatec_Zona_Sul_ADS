# Redes de Computadores

## Configurando Switches via console de um Computador

###### Modo Exec usuário	
O modo permite acesso a apenas um número limitado de comandos de monitoramento básico. É geralmente chamado de modo "view-only".
> Switch> 
> Router>

###### Modo EXEC privilegiado	
O modo permite acesso a todos os comandos e recursos. O usuário pode usar qualquer comando de monitoramento e executar a configuração e comandos de gerenciamento.
> Switch# 
> Router#

##### Acessando modo de Configuração Global Privilegiada
> Switch> enable
> Switch# configure terminal

##### Acessando outros modos de subconfiguração
Modo de configuração de linha
> Switch> enable
> Switch# configure terminal
> Switch(config)# line console 0
> Switch(config-line)# exit
> Switch(config)#

Modo de subconfiguração de linha VTY
> Switch> enable
> Switch# configure terminal
> Switch(config)# line console 0
> Switch(config-line)# line vty 0 15
> Switch(config-line)# exit
> Switch(config)#

Modo de Configuração da Interface
> Switch(config)# interface vlan 1
> Switch(config-if)# exit
> Switch(config)#

##### Examinando a configuração atual do switch
Esse comando irá mostrar todas as configurações do switch:
> Switch> enable
> Switch# show running-config

##### Atribuindo um nome a um switch.
> Switch> enable
> Switch# configure terminal
> Switch# hostname NovoNome
> Switch# exit

##### Definindo a senha do Console
Essa senha protege o acesso ao console:
> Switch> enable
> Switch# configure terminal
> Switch# line console 0
> Switch(config-line)# password letmein
> Switch(config-line)# login
> Switch(config-line)# end
> Switch#

##### Definindo uma senha para o Modo Privilegiado
Essa senha protege o acesso ao modo privilegiado:
> Switch> enable
> Switch(config)# configure terminal
> Switch(config)# enable password c1$c0
> Switch(config)# exit
> Switch#

##### Definindo uma senha para o Modo VTY
Essa senha protege o acesso ao modo privilegiado:
> Switch> enable
> Switch# configure terminal
> Switch(config)#line vty 0 15
> Switch(config-line)# password cisco
> Switch(config-line)# login 
> Switch(config-line)# end
> Switch#

##### Criptografando o Terminal
> Switch> enable
> Switch# configure terminal
> Switch(config)# service password-encryption
> Switch(config)#

##### Configurando uma senha para o Modo Privilegiado
configure uma senha criptografada para proteger o acesso ao modo privilegiado.
> Switch> enable
> Switch# configure terminal
> Switch(config)# enable secret itsasecret
> Switch(config)# exit
> Switch#

##### Configurando um Banner com uma mensagem
> Switch> enable
> Switch# configure terminal
> Switch(config)# banner motd # Apenas acesso autorizado #
> Switch(config)# exit 
> Switch# show running-config

##### Salvar e verificar arquivos de configuração no NVRAM
Etapa 1: verifique se a configuração está correta usando o comando show run.  
Salvar o arquivo de configuração. Você concluiu a configuração básica do switch. Agora faça backup do arquivo de configuração atual na NVRAM para garantir que as alterações não sejam perdidas caso o sistema seja reinicializado ou haja queda de energia.
> Switch> enable
> Switch# copy running-config startup-config
> Destination filename [startup-config]?[Enter]

Se deseja descartar as alterações feitas nas configurações do Switch, use o comando:
> Switch> enable
> Switch# erase startup-config
> Switch# reload

#### Configurando Endereço IP e Portas do Switch
> Switch> enable
> Switch# configure terminal
> Switch(config)# interface vlan 1
> Switch(config-if)# ip address 192.168.1.20 255.255.255.0
> Switch(config-if)# no shutdown
> Switch(config-if)# exit
> Switch(config)# ip default-gateway 192.168.1.1

Para testar a conectividade com os switches e computadores, use o comando ping no terminal do computador:
> C:/ ping 192.168.1.2

## Protocolos e Modelos

* ##### Protocolos de comunicação em rede:
	Os protocolos permitem que dois ou mais dispositivos se comuniquem através de um ou mais redes. A família de tecnologias Ethernet envolve uma variedade de protocolos como IP, Transmission Control Protocol (TCP), HyperText Protocolo de transferência (HTTP) e muito mais.
* ##### Protocolos de segurança de rede	
    Protocolos protegem os dados para fornecer autenticação, integridade dos dados e criptografia de dados. Exemplos de protocolos seguros incluem o Secure Shell (SSH), SSL (Secure Sockets Layer) e TLS (Transport Layer Security).
* ##### Protocolos de roteamento
    Protocolos permitem que os roteadores troquem informações de rota, compare caminho e, em seguida, selecionar o melhor caminho para o destino remota. Exemplos de protocolos de roteamento incluem Open Shortest Path First (OSPF) e Border Gateway Protocol (BGP).
* ##### Protocolos de descoberta de serviço	
    Protocolos são usados para a detecção automática de dispositivos ou serviços. Exemplos de protocolos de detecção de serviços incluem Host dinâmico Protocolo de Configuração (DHCP) que detecta serviços para endereço IP alocação e Sistema de Nomes de Domínio (DNS) que é usado para executar conversão de nome para endereço IP.

##### Protocolos de cada Camada
![Protocolos de cada Camada](https://ccna.network/wp-content/uploads/2020/11/Evolucao-dos-pacotes-de-protocolo.png)

#### Modelo OSI e TCP/IP

##### Modelo OSI
1. Físico: Os protocolos da camada física descrevem o mecânico, elétrico, meios funcionais e processuais para ativar, manter e desativar conexões físicas para uma transmissão de bits de e para uma rede dispositivo.
2. Enlace de dados:	Os protocolos da camada de enlace descrevem métodos para troca de dados quadros entre dispositivos em uma mídia comum
3. Rede: A camada de rede fornece serviços para trocar as partes individuais de dados através da rede entre dispositivos finais identificados.
4. Transporte: A camada de transporte define serviços para segmentar, transferir e remontar os dados para comunicações individuais entre o fim dispositivos.
5. Sessão: A camada de sessão fornece serviços para a camada de apresentação para organizar seu diálogo e gerenciar o intercâmbio de dados.
6. Apresentação	A camada de apresentação fornece uma representação comum dos dados transferidos entre serviços de camada de aplicativo.
7. Aplicação: A camada de aplicação contém protocolos usados para processo a processo comunicações.

##### Modelo TCP/IP

1. Acesso à Rede	Controla os dispositivos de hardware e o meio físico que formam a rede.
2. Internet	Determina o melhor caminho pela rede.
3. Transporte	Permite a comunicação entre vários dispositivos diferentes em redes distintas.
4. Aplicação	Representa dados para o usuário, além do controle de codificação e de diálogo.

![Modelo OSI e TCP/IP](https://www.dltec.com.br/blog/wp-content/uploads/2019/02/osi-tcp-ip.png)


### Terminologia de largura de banda
Os termos usados para medir a qualidade da largura de banda incluem:

#### Latência

O termo latência se refere ao tempo necessário para os dados viajarem de um ponto a outro, incluindo atrasos.
Em uma internetwork ou em uma rede com vários segmentos, a taxa de transferência não pode ser mais rápida que o link mais lento no caminho da origem ao destino. Mesmo que todos ou a maioria dos segmentos tenham alta largura de banda, será necessário apenas um segmento no caminho com baixa taxa de transferência para criar um gargalo na taxa de transferência de toda a rede.

#### Taxa de transferência

Taxa de transferência é a medida da transferência de bits através da mídia durante um determinado período.
Devido a alguns fatores, geralmente a taxa de transferência não corresponde à largura de banda especificada nas implementações da camada física. A taxa de transferência geralmente é menor que a largura de banda. Existem muitos fatores que influenciam a taxa de transferência:
 A quantidade de tráfego;
* O tipo de tráfego;
* A latência criada pelo número de dispositivos de rede encontrados entre a origem e o destino.
* Existem muitos testes de velocidade on-line que podem revelar a taxa de transferência de uma conexão com a Internet. A figura fornece exemplos de resultados de um teste de velocidade.

#### Dados úteis

Há uma terceira medida para avaliar a transferência de dados utilizáveis; é conhecido como goodput. Goodput é a medida de dados usáveis transferidos em um determinado período. Goodput é a taxa de transferência menos a sobrecarga de tráfego para estabelecer sessões, reconhecimentos, encapsulamento e bits retransmitidos. O goodput é sempre menor que a taxa de transferência, que geralmente é menor do que a largura de banda.

## Tipos de Redes Físicas

> Cabeamento de Cobre  
> Fibra Óptica  
> Sem Fio  