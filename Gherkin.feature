Feature: s

Scenario: CT1. 00	Cadastrar um agendamento.
Given ao entrar na tela de agendamento
And  preencho todos os campos
When clico no Button de “Criar Agenda”
Then deverá ser armazenado as informações preenchidas na base de dados

Scenario: CT1. 01	Validar campo agenda [Título do Serviço].

Scenario: CT1. 02	Validar campo agenda [Email].
Given ao entrar na tela de agendamento
And identificar o campo EMAIL
And preencher o campo, com dados válidos de acordo com sua especificação
When clico no Button de “Criar Agenda”
Then deve permitir gravar na base de dados, de acordo com sua tipagem e especificação.

Scenario: T1. 03	Validar campo agenda de inserção [data e hora] local inicial.

Given ao entrar na tela de agendamento
And identificar o campo DATA e HORA, local inicial
And clico no ícone da agenda
And atribuo uma data para o campo
When clico no Button de “Criar Agenda”
Then deve permitir gravar na base de dados, de acordo com sua tipagem e especificação.

Scenario: CT1. 04	Validar campo de agenda inserção [data e hora] local final.
Scenario: CT1. 05	Validar campo agenda [Observação]
Scenario: CT1. 06	Validar buscador de cliente.
Scenario: CT1. 07	Validar campo agenda de dados do cliente.

Scenario: CT1. 08	Validar view de lista de agendas.
Given ao entrar na tela de agendamento
And identificar o campo de Listagem das agendas criadas
When visualizo o campo, com a base de todos os dados cadastrados
Then o usuário poderá administrar a agenda, conforme sua necessidade

Scenario: CT1. 09	Validar update do registro da agenda existente.
Given ao entrar na tela de agendamento
And identificar o campo de Listagem das agendas criadas
When visualizo o campo, com a base de todos os dados cadastrados 
Then o usuário irá selecionar uma ação para alterar a agenda criada
And ao fazer a alteração, deve gravar na base de dados novamente

Scenario: CT1. 10	Validar delete do registro da agenda existente.
Given ao entrar na tela de agendamento
And identificar o campo de Listagem das agendas criadas
When visualizo o campo, com a base de todos os dados cadastrados 
Then o usuário irá selecionar uma ação para delete a agenda criada
And o registro irá ser apagado da base de dados 
And no campo de Listagem das agendas criada, o registro não irá mais existir.

Scenario: CT1. 11	[Button Cadastro] Validar todos campos inseridos.
Given ao entrar na tela de agendamento
And identificar os campos de preenchimento
And todos os campos preenchidos com dados válidos
When clico no Button de “Criar Agenda”
Then deverá ser armazenado as informações preenchidas na base de dados

Scenario: CT2. 00	Cadastrar um serviço.
Scenario: CT2. 01	Validar campo serviço [Título].
Scenario: CT2. 02	Validar campo serviço [Cliente].
Scenario: CT2. 03	Validar campo serviço [Valor].
Scenario: CT2. 04	Validar campo serviço [Status].
Scenario: CT2. 05	Validar view de lista de serviços.
Scenario: CT2. 06	Validar update de registro de serviços existente.
Scenario: CT2. 07	Validar delete do registro de serviço existente.
Scenario: CT2. 08	[Button Cadastro] Validar todos campos inseridos.
