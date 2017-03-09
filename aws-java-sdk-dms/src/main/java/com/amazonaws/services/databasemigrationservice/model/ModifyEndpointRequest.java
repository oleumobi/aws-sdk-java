/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The type of engine for the endpoint. Valid values include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA, REDSHIFT,
     * SYBASE, and SQLSERVER.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     */
    private String extraConnectionAttributes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     */
    private String sslMode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *         digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @return The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public ModifyEndpointRequest withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public ModifyEndpointRequest withEndpointType(ReplicationEndpointTypeValue endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA, REDSHIFT,
     * SYBASE, and SQLSERVER.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint. Valid values include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA,
     *        REDSHIFT, SYBASE, and SQLSERVER.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA, REDSHIFT,
     * SYBASE, and SQLSERVER.
     * </p>
     * 
     * @return The type of engine for the endpoint. Valid values include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA,
     *         REDSHIFT, SYBASE, and SQLSERVER.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The type of engine for the endpoint. Valid values include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA, REDSHIFT,
     * SYBASE, and SQLSERVER.
     * </p>
     * 
     * @param engineName
     *        The type of engine for the endpoint. Valid values include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA,
     *        REDSHIFT, SYBASE, and SQLSERVER.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to login to the endpoint database.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @return The user name to be used to login to the endpoint database.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name to be used to login to the endpoint database.
     * </p>
     * 
     * @param username
     *        The user name to be used to login to the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @param password
     *        The password to be used to login to the endpoint database.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @return The password to be used to login to the endpoint database.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password to be used to login to the endpoint database.
     * </p>
     * 
     * @param password
     *        The password to be used to login to the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @return The name of the server where the endpoint database resides.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server where the endpoint database resides.
     * </p>
     * 
     * @param serverName
     *        The name of the server where the endpoint database resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @param port
     *        The port used by the endpoint database.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @return The port used by the endpoint database.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port used by the endpoint database.
     * </p>
     * 
     * @param port
     *        The port used by the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @return The name of the endpoint database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the endpoint database.
     * </p>
     * 
     * @param databaseName
     *        The name of the endpoint database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection.
     */

    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @return Additional attributes associated with the connection.
     */

    public String getExtraConnectionAttributes() {
        return this.extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional attributes associated with the connection.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional attributes associated with the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withExtraConnectionAttributes(String extraConnectionAttributes) {
        setExtraConnectionAttributes(extraConnectionAttributes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate used for SSL connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEndpointRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @return The SSL mode to be used.</p>
     *         <p>
     *         SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *         </p>
     *         <p>
     *         The default value is none.
     * @see DmsSslModeValue
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public ModifyEndpointRequest withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
    }

    /**
     * <p>
     * The SSL mode to be used.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode to be used.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public ModifyEndpointRequest withSslMode(DmsSslModeValue sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: ").append(getEndpointIdentifier()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: ").append(getExtraConnectionAttributes()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getSslMode() != null)
            sb.append("SslMode: ").append(getSslMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEndpointRequest == false)
            return false;
        ModifyEndpointRequest other = (ModifyEndpointRequest) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getExtraConnectionAttributes() == null ^ this.getExtraConnectionAttributes() == null)
            return false;
        if (other.getExtraConnectionAttributes() != null && other.getExtraConnectionAttributes().equals(this.getExtraConnectionAttributes()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        return hashCode;
    }

    @Override
    public ModifyEndpointRequest clone() {
        return (ModifyEndpointRequest) super.clone();
    }

}
