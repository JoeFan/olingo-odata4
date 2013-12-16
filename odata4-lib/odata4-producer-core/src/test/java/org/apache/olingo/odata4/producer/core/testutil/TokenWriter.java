/*******************************************************************************
 * L icensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.olingo.odata4.producer.core.testutil;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

public class TokenWriter implements ParseTreeListener {

  @Override
  public void visitTerminal(final TerminalNode node) {
    /*
     * String out = String.format("%1$-" + 20 + "s", node.getText()); ;
     * int tokenType = node.getSymbol().getType();
     * if (tokenType == -1 ) {
     * out += "-1/EOF";
     * } else {
     * out += UriLexer.tokenNames[tokenType];
     * }
     * System.out.println(out);
     */
  }

  @Override
  public void visitErrorNode(final ErrorNode node) {
    // TODO Auto-generated method stub

  }

  @Override
  public void enterEveryRule(final ParserRuleContext ctx) {
    // TODO Auto-generated method stub

  }

  @Override
  public void exitEveryRule(final ParserRuleContext ctx) {
    // TODO Auto-generated method stub

  }

}