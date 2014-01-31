/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package br.org.teste;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

/**
 * A typical simple backing bean, that is backed to <code>aluno.xhtml</code>
 */
@Named("aluno")
@WindowScoped
public class AlunoController implements Serializable
{

    //properties
    private String nome;
    private Date dataNascimento;
    private boolean situacaoAluno;
    @Inject private AlunoService alunoService;

    /**
     * default empty constructor
     */
    public AlunoController()
    {
    }

    /**
     * Method that is backed to a submit button of a form.
     */
    public String send()
    {
        //do real logic, return a string which will be used for the navigation system of JSF



        return "page2.xhtml";
    }

    public String getGreeting()
    {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setDataNascimento(dataNascimento);
        aluno.setSituacaoAluno(true);

        alunoService.createAluno(aluno);

        return alunoService.createAluno(new Aluno());
    }

    //-------------------getter & setter

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(boolean situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }
}
