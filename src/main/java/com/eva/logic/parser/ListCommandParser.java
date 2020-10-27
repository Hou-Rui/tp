package com.eva.logic.parser;

import static com.eva.logic.parser.CliSyntax.PREFIX_APPLICANT_LIST;
import static com.eva.logic.parser.CliSyntax.PREFIX_STAFF_LIST;

import com.eva.commons.core.Messages;
import com.eva.logic.commands.ListCommand;
import com.eva.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new ListCommand object.
 */
public class ListCommandParser implements Parser<ListCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the ListCommand
     * and returns a ListCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    @Override
    public ListCommand parse(String args) throws ParseException {
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_STAFF_LIST, PREFIX_APPLICANT_LIST);

        if (argMultimap.isEmpty()
                || !argMultimap.getPreamble().isEmpty()) {
            throw new ParseException(
                    String.format(Messages.MESSAGE_INVALID_COMMAND_FORMAT, ListCommand.MESSAGE_USAGE));
        }

        if (argMultimap.getValue(PREFIX_STAFF_LIST).isPresent()) {
            return new ListCommand(true);
        } else if (argMultimap.getValue(PREFIX_APPLICANT_LIST).isPresent()) {
            return new ListCommand(false);
        } else {
            throw new ParseException(
                    String.format(Messages.MESSAGE_INVALID_COMMAND_FORMAT, ListCommand.MESSAGE_USAGE));
        }
    }
}
