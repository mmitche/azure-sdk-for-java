// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.store;

import com.microsoft.windowsazure.management.store.models.AddOnCreateParameters;
import com.microsoft.windowsazure.management.store.models.AddOnOperationStatusResponse;
import com.microsoft.windowsazure.management.store.models.AddOnUpdateParameters;
import com.microsoft.windowsazure.services.core.ServiceException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* Provides REST operations for working with Store add-ins from the Windows
* Azure store service.
*/
public interface AddOnOperations
{
    /**
    * The Create Store Item operation creates Windows Azure Store entries in a
    * Windows Azure subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceName The name of this resource.
    * @param addOnName The add on name.
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    AddOnOperationStatusResponse beginCreating(String cloudServiceName, String resourceName, String addOnName, AddOnCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerException, UnsupportedEncodingException, IOException, ServiceException;
    
    /**
    * The Create Store Item operation creates Windows Azure Store entries in a
    * Windows Azure subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceName The name of this resource.
    * @param addOnName The add on name.
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<AddOnOperationStatusResponse> beginCreatingAsync(String cloudServiceName, String resourceName, String addOnName, AddOnCreateParameters parameters);
    
    /**
    * The Delete Store Item operation deletes Windows Azure Store entries that
    * re provisioned for a subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceProviderNamespace The namespace in which this store item
    * resides.
    * @param resourceProviderType The type of store item to be deleted.
    * @param resourceProviderName The name of this resource provider.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    AddOnOperationStatusResponse beginDeleting(String cloudServiceName, String resourceProviderNamespace, String resourceProviderType, String resourceProviderName) throws IOException, ServiceException;
    
    /**
    * The Delete Store Item operation deletes Windows Azure Store entries that
    * re provisioned for a subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceProviderNamespace The namespace in which this store item
    * resides.
    * @param resourceProviderType The type of store item to be deleted.
    * @param resourceProviderName The name of this resource provider.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<AddOnOperationStatusResponse> beginDeletingAsync(String cloudServiceName, String resourceProviderNamespace, String resourceProviderType, String resourceProviderName);
    
    /**
    * The Create Store Item operation creates Windows Azure Store entries in a
    * Windows Azure subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceName The name of this resource.
    * @param addOnName The add on name.
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    AddOnOperationStatusResponse create(String cloudServiceName, String resourceName, String addOnName, AddOnCreateParameters parameters) throws InterruptedException, ExecutionException, ServiceException;
    
    /**
    * The Create Store Item operation creates Windows Azure Store entries in a
    * Windows Azure subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceName The name of this resource.
    * @param addOnName The add on name.
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<AddOnOperationStatusResponse> createAsync(String cloudServiceName, String resourceName, String addOnName, AddOnCreateParameters parameters);
    
    /**
    * The Delete Store Item operation deletes Windows Azure Storeentries that
    * are provisioned for a subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceProviderNamespace The namespace in which this store item
    * resides.
    * @param resourceProviderType The type of store item to be deleted.
    * @param resourceProviderName The name of this resource provider.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    AddOnOperationStatusResponse delete(String cloudServiceName, String resourceProviderNamespace, String resourceProviderType, String resourceProviderName) throws InterruptedException, ExecutionException, ServiceException;
    
    /**
    * The Delete Store Item operation deletes Windows Azure Storeentries that
    * are provisioned for a subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceProviderNamespace The namespace in which this store item
    * resides.
    * @param resourceProviderType The type of store item to be deleted.
    * @param resourceProviderName The name of this resource provider.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<AddOnOperationStatusResponse> deleteAsync(String cloudServiceName, String resourceProviderNamespace, String resourceProviderType, String resourceProviderName);
    
    /**
    * The Update Store Item operation creates Windows Azure Store entries in a
    * Windows Azure subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceName The name of this resource.
    * @param addOnName The addon name.
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    AddOnOperationStatusResponse update(String cloudServiceName, String resourceName, String addOnName, AddOnUpdateParameters parameters) throws ParserConfigurationException, SAXException, TransformerConfigurationException, TransformerException, UnsupportedEncodingException, IOException, ServiceException;
    
    /**
    * The Update Store Item operation creates Windows Azure Store entries in a
    * Windows Azure subscription.
    *
    * @param cloudServiceName The name of the cloud service to which this store
    * item will be assigned.
    * @param resourceName The name of this resource.
    * @param addOnName The addon name.
    * @param parameters Parameters used to specify how the Create procedure
    * will function.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request.  If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request, and also includes error information regarding the
    * failure.
    */
    Future<AddOnOperationStatusResponse> updateAsync(String cloudServiceName, String resourceName, String addOnName, AddOnUpdateParameters parameters);
}
