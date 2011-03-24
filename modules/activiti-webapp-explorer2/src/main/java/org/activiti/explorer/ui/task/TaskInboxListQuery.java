/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.explorer.ui.task;

import org.activiti.engine.task.TaskQuery;


/**
 * @author Joram Barrez
 */
public class TaskInboxListQuery extends AbstractTaskListQuery {
  
  protected TaskQuery query;
  
  public TaskInboxListQuery() {
    this.query = taskService.createTaskQuery().taskAssignee(userId).orderByTaskId().asc();
  }
  
  @Override
  protected TaskQuery getQuery() {
    return query;
  }
  
}