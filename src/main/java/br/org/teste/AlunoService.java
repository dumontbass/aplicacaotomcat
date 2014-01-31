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

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Named
@ApplicationScoped
public class AlunoService
{

    private EntityManager em;


    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }


    /**
     * Create aluno
     * @param aluno
     * @return
     */
    public String createAluno(Aluno aluno)
    {

        em.persist(aluno);

        return "Aluno " + aluno.getNome() + ". cadastrado!";
    }

    /**
     * Retrieve aluno
     * @return
     */
    public Collection<Aluno> findAllAluno(){

        Query query = em.createQuery("SELECT e FROM aluno e");
        return (Collection<Aluno>) query.getResultList();
    }


    /**
     * Retrieve one aluno
     * @param id
     * @return
     */
    public Aluno findAluno(int id) {
        return em.find(Aluno.class, id);
    }


    /**
     * Remove aluno
     * @param id
     */
    public void removeAluno(int id) {
        Aluno aluno = findAluno(id);
        if (aluno != null) {
            em.remove(aluno);
        }
    }


}
