/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore3.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Customer type.
 */
public class Customer {
    private Long id;
    private String username;
    private List<Address> address;

    /**
     * Default constructor.
     */
    public Customer() {
    }

    /**
     * Initialization constructor.
     * @param  id  Long value for id.
     * @param  username  String value for username.
     * @param  address  List of Address value for address.
     */
    public Customer(
            Long id,
            String username,
            List<Address> address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

    /**
     * Getter for Id.
     * @return Returns the Long
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Long
     */
    @JsonSetter("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for Username.
     * @return Returns the String
     */
    @JsonGetter("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsername() {
        return username;
    }

    /**
     * Setter for Username.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for Address.
     * @return Returns the List of Address
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for List of Address
     */
    @JsonSetter("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * Converts this Customer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Customer [" + "id=" + id + ", username=" + username + ", address=" + address + "]";
    }

    /**
     * Builds a new {@link Customer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Customer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .username(getUsername())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link Customer}.
     */
    public static class Builder {
        private Long id;
        private String username;
        private List<Address> address;



        /**
         * Setter for id.
         * @param  id  Long value for id.
         * @return Builder
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for username.
         * @param  username  String value for username.
         * @return Builder
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  List of Address value for address.
         * @return Builder
         */
        public Builder address(List<Address> address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link Customer} object using the set fields.
         * @return {@link Customer}
         */
        public Customer build() {
            return new Customer(id, username, address);
        }
    }
}